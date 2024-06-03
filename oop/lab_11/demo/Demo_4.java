package oop.lab_11.demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_4 {
    static String path = "resources\\example.txt";
    static Person[] persons = {
            new Person("Фёдоров", "Фёдор","Фёдорович", 1995, "man"),
            new Person("Антонова", "Антонина", "Антоновна", 2008, "woman"),
            new Person("Сидоров", "Сидор","Сидорович", 1971, "man"),
            new Person("Александрова","Александра","Александровна",2001, "woman"),
            new Person("Иванов","Иван","Иванович", 1971, "man")
    };

    public static boolean save (Person[] persons) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(persons);
            out.flush();
            return true;
        }catch (IOException ex){
            System.out.println("Exception: " + ex.getClass() + " in " + ex.getMessage() );
        }
        return false;
    }

    public static void reload(){
        if (Files.exists(Paths.get(path))){

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))){
                Person[] persons = (Person[]) in.readObject();
                for (Person man : persons){
                    System.out.println(man.toGenderString());
                }
            }catch (ClassNotFoundException ex){
                System.out.println("Считанные данные оказались иного формата: " + ex.getMessage());
            }catch (FileNotFoundException e){
                System.out.println("There is no file at such path: " + path);
            }catch (IOException e){
                System.out.println("Something wrong: " + e.getMessage());
            }
        }
        else {
            System.out.println("There is no file at such path: " + path);
        }
    }

    public static void main(String[] args) {
        reload();
    }
}
