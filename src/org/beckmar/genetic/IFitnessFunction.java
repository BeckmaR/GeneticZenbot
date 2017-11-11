package org.beckmar.genetic;

public interface IFitnessFunction {
    public double getFitness(IPhenotype phenotype);
    public FitnessMode getMode();

    public enum FitnessMode {
        MORE_IS_BETTER,
        LESS_IS_BETTER
    }
}
