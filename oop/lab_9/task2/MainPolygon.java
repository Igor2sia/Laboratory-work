package oop.lab_9.task2;

import java.util.Scanner;

public class MainPolygon {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] sides = new int[arr.length];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = Integer.parseInt(arr[i]);
        }
        try {
            Triangle circle = new Triangle(sides);
            System.out.println(circle);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


