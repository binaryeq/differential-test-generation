package io.github.bineq.featurecomp;

import io.github.bineq.Content;
import org.objectweb.asm.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Utilities using bytecode analysis.
 * @author jens dietrich
 */
public class ComputeBytecodeSummary {

    public static boolean SKIP_ENUM_VALUES_ACCESS = true;

    /**
     * Compute a set consisting on superclass, interfaces and non-synthetic fields and methods, methods invocations.
     * Can be used to identify non-equivalent classes.
     * @param bytecode
     * @return
     * @throws IOException
     */
    public static Set<String> computeMemberSummary(Content bytecode) throws IOException {
        ClassReader reader = new ClassReader(bytecode.load());
        Set<String> summary = new HashSet<>();
        int ASM_VERSION = Opcodes.ASM9;
        reader.accept(new ClassVisitor(ASM_VERSION) {
            @Override
            public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                super.visit(version, access, name, signature, superName, interfaces);
                summary.add("superclass: " + superName);
                for (String intrfc:interfaces) {
                    summary.add("interface: " + intrfc);
                }
            }

            @Override
            public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
                super.visitField(access, name, descriptor, signature, value);
                if (!isSynthetic(access)) {
                    summary.add("field: " + name + "|" + descriptor);
                }
                return null;
            }

            @Override
            public MethodVisitor visitMethod(int access, String methodName, String methodDescriptor, String methodSignature, String[] exceptions) {
                super.visitMethod(access, methodName, methodDescriptor, methodSignature, exceptions);
                if (!isSynthetic(access) && !methodName.equals("<init>")) {
                    summary.add("method: " + methodName + methodDescriptor);
                }
                return new MethodVisitor(ASM_VERSION) {
                    @Override
                    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
                        String invocationType = getInvocationType(opcode) ;
                        summary.add("call site in " + methodName + methodDescriptor + ": " + invocationType + "->" + owner+"::"+name+descriptor);
                    }

                    @Override
                    public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
                        super.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
                        String invocationType = "invokedynamic" ;
                        summary.add("call site in: " + methodName + methodDescriptor + ": " + invocationType + "->[" + bootstrapMethodHandle.getOwner()+"::"+bootstrapMethodHandle.getName()+bootstrapMethodHandle.getDesc()+"]::"+name+descriptor);
                    }

                    @Override
                    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                        super.visitFieldInsn(opcode, owner, name, descriptor);
                        String accessType = getAccessType(opcode) ;

                        if (SKIP_ENUM_VALUES_ACCESS && methodName.equals("$values") && accessType.equals("getfield")) {
                            return;
                        }


                        summary.add("access site in: " + methodName + methodDescriptor + ": " + accessType + "->" + owner+"::"+name+ "|" + descriptor);
                    }

                    @Override
                    public void visitLdcInsn(Object cst) {

                        // ony look for values
                        if (cst instanceof Number | cst instanceof String) {
                            summary.add("constant load in: " + methodName + methodDescriptor + ": " + " type: " + cst.getClass() + ", value: " + cst);
                        }
                    }
                };
            }
        },0);
        return summary;
    }

    public static boolean isSynthetic(int flags) {
        return (Opcodes.ACC_SYNTHETIC & flags) != 0;
    }

    public static String getInvocationType(int flags) {
        if ((Opcodes.INVOKESTATIC & flags) != 0) {
            return "invokestatic";
        }
        if ((Opcodes.INVOKESPECIAL & flags) != 0) {
            return "invokespecial";
        }
        if ((Opcodes.INVOKEINTERFACE & flags) != 0) {
            return "invokeinterface";
        }
        if ((Opcodes.INVOKEVIRTUAL & flags) != 0) {
            return "invokevirtual";
        }
        assert false;
        return "invoke-other";
    }

    public static String getAccessType(int flags) {
        if ((Opcodes.GETFIELD & flags) != 0) {
            return "getfield";
        }
        if ((Opcodes.PUTFIELD & flags) != 0) {
            return "putfield";
        }
        if ((Opcodes.GETSTATIC & flags) != 0) {
            return "getstatic";
        }
        if ((Opcodes.INVOKEVIRTUAL & flags) != 0) {
            return "putstatic";
        }
        assert false;
        return "access-other";
    }
}
