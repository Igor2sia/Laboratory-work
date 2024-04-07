package oop;

import java.util.Scanner;

public class Trianglemain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side A");
        int sideA = scanner.nextInt();
        if (sideA < 0) sideA = sideA * -1;
        System.out.println("Input side B");
        int sideB = scanner.nextInt();
        if (sideB < 0) sideB = sideB * -1;
        System.out.println("Input side C");
        int sideC = scanner.nextInt();
        if (sideC < 0) sideC = sideC * -1;
        new Triangle(sideA,sideB,sideC);
        System.out.println(Triangle.getInfoTriangle());
    }
}
