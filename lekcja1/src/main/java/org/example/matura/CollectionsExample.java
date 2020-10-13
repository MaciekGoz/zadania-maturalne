package org.example.matura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CollectionsExample {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int random = ThreadLocalRandom.current().nextInt(100);
            integers.add(random);
        }

        System.out.println(listContains(integers, 50));

        System.out.println(integers);

        if(integers.contains(50)) {
            System.out.println("lista zawiera 50");
        } else {
            System.out.println("lista nie zawiera 50");
        }
    }

    public static boolean listContains(List<Integer> list, int numberToFind) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == numberToFind) {
                return true;
            }
        }
        return false;
    }
}
