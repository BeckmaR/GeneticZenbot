package org.beckmar.genetic;

import java.util.ArrayList;
import java.util.List;

public class ChildCreator {
    protected ICrossoverStrategy crossoverStrategy;
    protected MutationHandler mutationHandler;

    public ChildCreator(ICrossoverStrategy crossoverStrategy) {
        this.crossoverStrategy = crossoverStrategy;
        this.mutationHandler = new MutationHandler();
    }

    public void configureChild(IPhenotype parent1, IPhenotype parent2, IPhenotype child1, IPhenotype child2) {
        List<IGene<? extends Object>> childGenes1 = new ArrayList<>();
        List<IGene<? extends Object>> childGenes2 = new ArrayList<>();

        crossoverStrategy.crossover(parent1.getGenes(), parent2.getGenes(), childGenes1, childGenes2);

        mutationHandler.mutate(childGenes1);
        mutationHandler.mutate(childGenes2);

        child1.setGenes(childGenes1);
        child2.setGenes(childGenes2);
    }
}
