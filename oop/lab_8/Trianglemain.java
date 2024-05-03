package oop.lab_8;

import java.util.Scanner;

public class Trianglemain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side A");
        int sideA = scanner.nextInt();
        System.out.println("Input side B");
        int sideB = scanner.nextInt();
        System.out.println("Input side C");
        int sideC = scanner.nextInt();
        Triangle triangle = new Triangle(sideA,sideB,sideC);
        System.out.println(triangle.getInfoTriangle());
    }
}
