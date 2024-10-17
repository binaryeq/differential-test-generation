package io.github.bineq.featurecomp;

/**
 * Feature type.
 * @author jens dietrich
 */
public enum FeatureType {
    SUPER_CLASS, INTERFACE,
    FIELD, METHOD,
    INVOKE_INTERFACE, INVOKE_DYNAMIC, INVOKE_VIRTUAL, INVOKE_STATIC, INVOKE_SPECIAL,
    PUT_FIELD, GET_FIELD, PUT_STATIC_FIELD, GET_STATIC_FIELD,
    CONSTANT,
    UNKNOWN
}
