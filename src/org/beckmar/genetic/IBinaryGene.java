package org.beckmar.genetic;

public interface IBinaryGene extends IGene {
    BinaryField getBinaryRepresentation();
    void setBinaryRepresentation(BinaryField binaryData);
}
