package org.example.matura.items;

public class ComputerMice extends Item implements HasPower {
    private String brand;
    private String model;
    private int price;
    private int maxDpi;

    public ComputerMice(String brand, String model, int price, int maxDpi) {
        super(brand, model, price);
        this.maxDpi = maxDpi;
    }

    public int getMaxDpi() {
        return maxDpi;
    }

    public void setMaxDpi(int maxDpi) {
        this.maxDpi = maxDpi;
    }

//    @Override
//    public void turnOn() {
//        System.out.println("Turned Monitor on");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Turned Monitor off");
//    }
}
