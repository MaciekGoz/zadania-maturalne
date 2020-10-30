package org.example.matura.items;

public interface HasPower {
    default void turnOn() {
        System.out.printf("Turned %s on\n", getClass().getSimpleName());
    }
    default void turnOff() {
        System.out.printf("Turned %s off\n", getClass().getSimpleName());
    }
}
