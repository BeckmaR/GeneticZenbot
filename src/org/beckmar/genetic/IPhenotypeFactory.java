package org.beckmar.genetic;

public interface IPhenotypeFactory<T extends IPhenotype> {
    public T createNewBlankPhenotype();

    public T createNewRandomPhenotype();
}
