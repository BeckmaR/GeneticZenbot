package org.beckmar.genetic;

import java.util.List;

public interface ICrossoverStrategy {
    public void crossover(List<IGene> parent1, List<IGene> parent2, List<IGene> child1, List<IGene> child2);
}
