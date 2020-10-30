package org.example.matura;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[][] twoDimensionArray = new int[10][12];

        for (int i = 0; i < twoDimensionArray.length; i += 2) {
            for (int j = 0; j < twoDimensionArray[0].length; j++) {
                twoDimensionArray[i][j] = 1;
            }
        }


        /*
        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = i % 2 == 0 ? 1 : 0; j < twoDimensionArray[0].length; j+=2) {
                twoDimensionArray[i][j] = 1;
            }
        }
        */

//        for (int i = 0; i < twoDimensionArray.length; i++) {
//            for (int j = 0; j < twoDimensionArray[0].length; j++) {
//                System.out.print(twoDimensionArray[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int k = <warunek> ? <wartosc gdy prawda> : <wartosc gdy falsz
        int k = 2 < 5 ? 1 : 0;

        int[][] twoDimensionArray2 = new int[12][12];

        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                twoDimensionArray2[i][j] = ThreadLocalRandom.current().nextInt(-99, 100);
            }
        }
        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                System.out.print(twoDimensionArray2[i][j] + " ");
            }
            System.out.println();
        }
        int counter = 0;
        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                if (twoDimensionArray2[i][j] < 0) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);

        counter = 0;
        int counter2 = 0;
        for (int i = 0; i < twoDimensionArray2[0].length; i++) {
            for (int j = 0; j < twoDimensionArray2.length; j++) {
                if (twoDimensionArray2[j][i] < 0) {
                    counter++;
                    if (counter == 5) {
                        counter2++;
                        counter = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(counter2);

        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                if (i == j) {
                    twoDimensionArray2[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                if (j < i) {
                    twoDimensionArray2[i][j] = 10;
                } else if (i < j) {
                    twoDimensionArray2[i][j] = 150;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                System.out.print(twoDimensionArray2[i][j] + " ");
            }
            System.out.println();
        }

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("wynik.txt"))) {
            for (int i = 0; i < twoDimensionArray2.length; i++) {
                for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                    bw.append(String.valueOf(twoDimensionArray2[i][j])).append(" ");
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0;
        for (int i = 0; i < twoDimensionArray2.length; i++) {
            for (int j = 0; j < twoDimensionArray2[0].length; j++) {
                if (j < i) {
                    sum += twoDimensionArray2[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}