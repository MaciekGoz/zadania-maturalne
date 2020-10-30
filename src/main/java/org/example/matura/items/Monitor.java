package org.example.matura.items;

public class Monitor extends Item implements HasPower {

    private String resolution;

    public Monitor(String brand, String model, int price, String resolution) {
        super(brand, model, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
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
