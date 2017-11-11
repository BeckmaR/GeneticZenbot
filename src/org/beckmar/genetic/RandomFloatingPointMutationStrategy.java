package org.beckmar.genetic;

import java.util.Random;

public class RandomFloatingPointMutationStrategy implements IMutationStrategy<FloatGene> {
    protected Random randomGenerator;
    protected double mutationProbability;
    protected boolean allowNegative;

    public RandomFloatingPointMutationStrategy(double mutationProbability, boolean allowNegative) {
        this.mutationProbability = mutationProbability;
        this.allowNegative = allowNegative;
        this.randomGenerator = new Random();
    }

    @Override
    public void mutate(FloatGene gene) {
        if(randomGenerator.nextDouble() < mutationProbability) {
            double gaussian = randomGenerator.nextGaussian() + 1;
            while(!allowNegative && gaussian < 0) {
                gaussian = randomGenerator.nextGaussian() + 1;
            }

            gene.setValue(gene.getValue() * gaussian);
        }
    }
}
