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
    public static Set<Feature> computeMemberSummary(Content bytecode) throws IOException {
        ClassReader reader = new ClassReader(bytecode.load());
        Set<Feature> summary = new HashSet<>();
        int ASM_VERSION = Opcodes.ASM9;
        reader.accept(new ClassVisitor(ASM_VERSION) {

            private String className = null;
            @Override
            public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                super.visit(version, access, name, signature, superName, interfaces);
                className = name;
                summary.add(new Feature(className,null,null,FeatureType.SUPER_CLASS,superName));
                for (String intrfc:interfaces) {
                    summary.add(new Feature(className,null,null,FeatureType.INTERFACE,intrfc));
                }
            }

            @Override
            public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
                super.visitField(access, name, descriptor, signature, value);
                if (!isSynthetic(access)) {
                    summary.add(new Feature(className, name, descriptor,FeatureType.FIELD,null));
                }
                return null;
            }

            @Override
            public MethodVisitor visitMethod(int access, String methodName, String methodDescriptor, String methodSignature, String[] exceptions) {
                super.visitMethod(access, methodName, methodDescriptor, methodSignature, exceptions);
                if (!isSynthetic(access)) {
                    summary.add(new Feature(className, methodName, methodDescriptor,FeatureType.METHOD,null));
                }
                return new MethodVisitor(ASM_VERSION) {
                    @Override
                    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
                        FeatureType invocationType = getInvocationType(opcode) ;
                        summary.add(new Feature(className,methodName,  methodDescriptor,invocationType,owner+"::"+name+descriptor));
                    }

                    @Override
                    public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
                        super.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
                        summary.add(new Feature(className,methodName ,methodDescriptor ,FeatureType.INVOKE_DYNAMIC, "[" + bootstrapMethodHandle.getOwner()+"::"+bootstrapMethodHandle.getName()+bootstrapMethodHandle.getDesc()+"]::"+name+descriptor));
                    }

                    @Override
                    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                        super.visitFieldInsn(opcode, owner, name, descriptor);
                        FeatureType accessType = getAccessType(opcode) ;

                        if (SKIP_ENUM_VALUES_ACCESS && methodName.equals("$values") && accessType.equals("getfield")) {
                            return;
                        }


                        summary.add(new Feature(className,methodName, methodDescriptor,accessType,owner+"::"+name+ "|" + descriptor));
                    }

                    @Override
                    public void visitLdcInsn(Object cst) {

                        // ony look for values
                        if (cst instanceof Number | cst instanceof String) {
                            summary.add(new Feature(className,methodName,methodDescriptor,FeatureType.CONSTANT," type: " + cst.getClass() + "; value: " + cst));
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

    public static FeatureType getInvocationType(int flags) {
        if ((Opcodes.INVOKESTATIC & flags) != 0) {
            return FeatureType.INVOKE_STATIC;
        }
        if ((Opcodes.INVOKESPECIAL & flags) != 0) {
            return FeatureType.INVOKE_SPECIAL;
        }
        if ((Opcodes.INVOKEINTERFACE & flags) != 0) {
            return FeatureType.INVOKE_INTERFACE;
        }
        if ((Opcodes.INVOKEVIRTUAL & flags) != 0) {
            return FeatureType.INVOKE_VIRTUAL;
        }
        assert false;
        return FeatureType.UNKNOWN;
    }

    public static FeatureType getAccessType(int flags) {
        if ((Opcodes.GETFIELD & flags) != 0) {
            return FeatureType.GET_FIELD;
        }
        if ((Opcodes.PUTFIELD & flags) != 0) {
            return FeatureType.PUT_FIELD;
        }
        if ((Opcodes.GETSTATIC & flags) != 0) {
            return FeatureType.GET_STATIC_FIELD;
        }
        if ((Opcodes.PUTSTATIC & flags) != 0) {
            return FeatureType.PUT_STATIC_FIELD;
        }
        assert false;
        return FeatureType.UNKNOWN;
    }
}
