package oop;

import java.util.Scanner;

public class AppleTreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт");
        String inputSort = scanner.nextLine();
        System.out.println("Введите возраст");
        int inputAge = scanner.nextInt();
        AppleTree appleTree = new AppleTree(inputSort, inputAge);
        System.out.println(appleTree.getInfo());
    }
}
