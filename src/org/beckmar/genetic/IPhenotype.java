package org.beckmar.genetic;

import java.util.List;

public interface IPhenotype {
    public List<IGene<? extends Object>> getGenes();
    public void setGenes(List<IGene<? extends Object>> genes);
}
