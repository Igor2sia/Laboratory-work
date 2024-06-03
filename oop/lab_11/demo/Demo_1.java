package oop.lab_11.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo_1 {
    static String path = "resources\\example.txt";
    static Scanner scanner = new Scanner(System.in);
    static String text = "";

    public static void main(String[] args){
        String inputLast = "";
        while (!text.equalsIgnoreCase("end")){
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end"))
                write(inputLast);

            inputLast = input;
        }
    }
    static void write (String text){
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(text);
            writer.write(System.lineSeparator());
            writer.flush();
        }catch (IOException e){
            System.out.println("Exeption" + e.getMessage());
        }
    }
}