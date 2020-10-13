package org.example.matura;

public class LoopsExample {

    public static void main(String[] args) {
        for (int i = 100; i < 201; i+=2) {
            System.out.println(i);
        }
        int i = 100;
        while (i < 200) {
            System.out.println(i);
            i+=2;
        }

        i = 100;
        do {
            System.out.println(i);
            i+=2;
        } while (i <= 200);
    }

}
