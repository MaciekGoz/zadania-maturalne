package org.example.matura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomExample {
    public static void main(String[] args) {
        int i = ThreadLocalRandom.current().nextInt();
        int j = ThreadLocalRandom.current().nextInt(100);
        int k = ThreadLocalRandom.current().nextInt(5,15);

        Random random = new Random();
        int l = random.nextInt();
        int m = random.nextInt(101);
        int n = 2 + random.nextInt(9);
    }
}
