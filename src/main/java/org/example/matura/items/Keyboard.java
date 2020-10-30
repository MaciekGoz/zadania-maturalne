package org.example.matura.items;

import com.sun.tools.javac.jvm.Items;

public class Keyboard extends Item {
    private int numberOfKeys;

    public Keyboard(String brand, String model, int price, int numberOfKeys) {
        super(brand, model, price);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

}
