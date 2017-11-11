package org.beckmar.genetic;

public class FloatGene implements IGene {
    protected double value;

    public FloatGene(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
