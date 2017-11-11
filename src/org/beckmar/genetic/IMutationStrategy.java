package org.beckmar.genetic;

import java.util.List;

public interface IMutationStrategy<T extends IGene> {
    public void mutate(T gene);
}
