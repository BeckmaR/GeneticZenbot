package org.beckmar.genetic;

import java.util.List;
import java.util.Random;

public class RandomBitwiseMutationStrategy implements IMutationStrategy<IBinaryGene> {
    protected Random randomGenerator;
    protected double mutationProbability;

    public RandomBitwiseMutationStrategy(double mutationProbability) {
        this.mutationProbability = mutationProbability;
        this.randomGenerator = new Random();
    }

    @Override
    public void mutate(IBinaryGene gene) {
        BinaryField binaryField = gene.getBinaryRepresentation();
        for(int i = 0; i < binaryField.getSize(); i++) {
            double random = randomGenerator.nextDouble();
            if(random < mutationProbability) {
                binaryField.toggleBitAt(i);
            }
        }
    }
}
