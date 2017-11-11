package org.beckmar.genetic;

import java.util.ArrayList;
import java.util.List;

public class PopulationEngine {
    protected List<IPhenotype> population;
    protected IPhenotypeFactory phenotypeFactory;
    protected int populationSize;
    protected int generationCount;
    protected int maxGenerationCount;

    public PopulationEngine(IPhenotypeFactory factory, int populationSize) {
        phenotypeFactory = factory;
        this.populationSize = populationSize;
        this.population = new ArrayList<>(populationSize);

        createInitialPopulation();
    }

    public void setMaxGenerationCount(int maxGenerationCount) {
        this.maxGenerationCount = maxGenerationCount;
    }

    public int getGenerationCount() {
        return generationCount;
    }

    protected void createInitialPopulation() {
        for(int i = 0; i < populationSize; i++) {
            population.add(phenotypeFactory.createNewRandomPhenotype());
        }
    }

    protected boolean checkAbort() {
        if(maxGenerationCount != 0 && generationCount > maxGenerationCount) {
            return true;
        }

        return false;
    }
}
