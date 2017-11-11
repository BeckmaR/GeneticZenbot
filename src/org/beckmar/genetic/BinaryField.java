package org.beckmar.genetic;

public class BinaryField {
    protected int size;
    protected int binaryData;

    public BinaryField(int size) {
        this.size = size;
        this.binaryData = 0;
    }

    public int getSize() {
        return size;
    }

    public int getBitAt(int index) {
        if(!checkIndex(index)) {
            return 0;
        }
        return (binaryData & (1 << index)) > 0 ? 1 : 0;
    }

    public void toggleBitAt(int index) {
        if(!checkIndex(index)) {
            return;
        }
        binaryData = binaryData ^ (1 << index);
    }

    public void setBitAt(int index) {
        if(!checkIndex(index)) {
            return;
        }
        binaryData = binaryData | (1 << index);
    }

    protected boolean checkIndex(int index) {
        return index < size;
    }
}
