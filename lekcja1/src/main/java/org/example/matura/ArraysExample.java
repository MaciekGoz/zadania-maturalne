package org.example.matura;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {1, 3, 25, 6, 9, 13};

//        System.out.println(Arrays.toString(generateRandomArray(10,0,100)));
        System.out.println(maxNumberFromArray(array));

        System.out.println(averageNumberFromArray(array));

        System.out.println(medianFromArray(array));

    }

    public static int [] generateRandomArray(int size, int from, int to) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(from, to);
        }
        return array;
    }

    public static int maxNumberFromArray(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static double averageNumberFromArray(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average/array.length;
    }

    public static double medianFromArray(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 != 0) {
            return array[middle];
        } else {
            return (array[middle] + array[middle -1]) / 2d;
////            0 1 2 3 4 5 6 7
        }
    }

    public static int[] bubbleSortOfNumbersFromArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    // test do bubble sort
    // napisac metode do sortowania przez wstawianie i druga przez wybieranie + testy


}
