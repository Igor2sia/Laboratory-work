package oop.lab_11.task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task_2 {
    static String path = "resources\\text.txt";
    static String[] text;

    public static void main(String[] args) {

        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            text = scanner.nextLine().split("^");
            sqrt(text);

        } catch (FileNotFoundException e) {
            System.out.println("Wrong path " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
    public static String sqrt (String[] text){
        ArrayList<String> example = new ArrayList<>();
        try {
            example.addAll(Arrays.asList(text));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        return example.toString();
    }
}

