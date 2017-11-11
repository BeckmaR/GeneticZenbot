package org.beckmar.genetic;

import java.util.List;

public class MutationHandler {
    protected RandomBitwiseMutationStrategy randomBitwiseMutationStrategy;
    protected RandomFloatingPointMutationStrategy randomFloatingPointMutationStrategy;

    public MutationHandler() {
        this.randomBitwiseMutationStrategy = new RandomBitwiseMutationStrategy(0.02);
        this.randomFloatingPointMutationStrategy = new RandomFloatingPointMutationStrategy(0.02, false);
    }

    public void mutate(List<IGene> genes) {
        for(IGene gene : genes) {
            if(gene instanceof IBinaryGene) {
                randomBitwiseMutationStrategy.mutate((IBinaryGene) gene);
            } else if(gene instanceof FloatGene) {
                randomFloatingPointMutationStrategy.mutate((FloatGene) gene);
            }
        }
    }
}
