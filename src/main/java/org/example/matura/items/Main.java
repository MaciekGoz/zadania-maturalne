package org.example.matura.items;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();

        ComputerMice computerMice = new ComputerMice("Logitech", "100", 200, 12000);
        Keyboard keyboard = new Keyboard("Microsoft", "220", 300, 150);
        Monitor monitor = new Monitor("Acer", "24aded", 1000, "1080x1920");
        Monitor monitor2 = new Monitor("Asus", "27aewf", 2000, "2k");
        Monitor monitor3 = new Monitor("Dell", "21rwfw", 500, "1080x1920");
        Monitor monitor4 = new Monitor("Samsung", "30wad", 2000, "4k");

        monitor.turnOff();

        itemList.add(computerMice);
        itemList.add(keyboard);
        itemList.add(monitor);
        itemList.add(monitor2);
        itemList.add(monitor3);
        itemList.add(monitor4);

        int counter = 0;
        for (Item item : itemList) {
            if (item instanceof Monitor) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
