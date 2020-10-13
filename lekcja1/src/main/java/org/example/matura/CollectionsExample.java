package org.example.matura;

import java.util.*;
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

        Stack<String> stack = new Stack<>();
        stack.push("ala");
        stack.push("ma");
        stack.push("kota");

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.search("ala"));

        Deque<String> queue = new ArrayDeque<>();
        queue.add("ala");
        queue.add("ma");
        queue.add("kota");
        queue.add("i");
        queue.add("psa");

        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.offer("elo"));
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
