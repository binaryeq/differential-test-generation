package io.github.bineq.featurecomp;

/**
 * A pair of providers.
 * @author jens dietrich
 */
record PairOfProviders(String left, String right) {
    PairOfProviders swap() {
        return new PairOfProviders(right, left);
    }
}
