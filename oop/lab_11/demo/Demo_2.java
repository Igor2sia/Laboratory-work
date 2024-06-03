package oop.lab_11.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_2 {
    static String path = "resources\\example.txt";
    static Person[] persons = {
            new Person("Фёдоров", "Фёдор","Фёдорович", 1995),
            new Person("Сидоров", "Сидор","Сидорович", 1971),
            new Person("Петров","Петр","Петрович",1958),
            new Person("Иванов","Иван","Иванович", 1971)
    };
    static void writePersons(){
        try (FileWriter writer = new FileWriter(path, false)){
            for (Person man : persons){
                writer.write(man.toString());
                writer.write(System.lineSeparator());
            }
            writer.flush();
        }catch (IOException e){
            System.out.println("" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writePersons();
    }
}
