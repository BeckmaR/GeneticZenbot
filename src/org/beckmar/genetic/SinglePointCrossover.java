package org.beckmar.genetic;

import java.util.List;
import java.util.Random;

public class SinglePointCrossover implements ICrossoverStrategy {
    protected Random randomGenerator;

    public SinglePointCrossover() {
        randomGenerator = new Random();
    }

    @Override
    public void crossover(List<IGene> parent1, List<IGene> parent2, List<IGene> child1, List<IGene> child2) {
        int size = parent1.size();
        if(parent2.size() != size || child1.size() != size || child2.size() != size) {
            return;
        }

        child1.clear();
        child2.clear();

        child1.addAll(parent1);
        child2.addAll(parent2);

        double random = randomGenerator.nextDouble();
        int crossOverPoint = (int) ((parent1.size() - 1 ) * random);

        for(int i = crossOverPoint; i < parent1.size(); i++) {
            child1.set(i, parent2.get(i));
            child2.set(i, parent1.get(i));
        }
    }
}
