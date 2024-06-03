package oop.lab_12.demo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Queue<String> tasks = new ArrayDeque<>();
        while (!"print".equalsIgnoreCase(input = scanner.nextLine())){
            if ("done".equalsIgnoreCase(input)){
                if (tasks.isEmpty()) System.out.println("NO tasks");
                else System.out.println("DONE: " + tasks.poll());
            }else {
                tasks.offer(input);

            }
        }
        while (!tasks.isEmpty()){
            System.out.println("DOIT: " + tasks.poll());
        }
    }
}
