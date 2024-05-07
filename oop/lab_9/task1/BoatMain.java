package oop.lab_9.task1;

import java.util.Scanner;

public class BoatMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pas = scanner.nextInt();
        int oars = scanner.nextInt();
        Boat boat = new Boat(pas, oars);
        System.out.println(boat.toString());
    }
}
