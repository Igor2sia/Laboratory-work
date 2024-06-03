package oop.lab_11.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Demo_3 {
    static String path = "resources\\example.txt";
    static String temp[];

    public static void main(String[] args) {
        for (Person man : readPersons()){
            System.out.println(man);
        }
    }

    static Person[] readPersons() {
        Person[] people = null;
        int count = 0;
        if (Files.exists(Paths.get(path))) {
            try {
                count = (int) Files.lines(Paths.get(path)).count();
                people = new Person[count];
            } catch (IOException e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()){
                temp = scanner.nextLine().split(" ");
                people[--count] = new Person(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]));
            }
        }catch (FileNotFoundException e){
            System.out.println("Wrong path " + e.getMessage());
        }catch (IOException e){
            System.out.println("Exception " + e.getMessage());
        }
        return people;

    }
}
