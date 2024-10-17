package io.github.bineq.featurecomp;

import java.util.Comparator;

public record Feature(String className, String memberName, String memberDescriptor, FeatureType type, String value) implements Comparable<Feature> {

    @Override
    public int compareTo(Feature o) {
        return Comparator.comparing((Feature f) -> f.className==null?"":f.className)
            .thenComparing((Feature f) -> f.memberName==null?"":f.memberName)
            .thenComparing((Feature f) -> f.memberDescriptor==null?"":f.memberDescriptor)
            .thenComparing((Feature f) -> f.type==null?"":f.type.toString())
            .thenComparing((Feature f) -> f.value==null?"":f.value)
            .compare(this, o);
    }

    public String toTSV() {
        final char SEP = '\t';
        return className + SEP + memberName + SEP + memberDescriptor + SEP + type + SEP + value;
    }
}
