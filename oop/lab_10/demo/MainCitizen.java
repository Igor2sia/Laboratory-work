package oop.lab_10.demo;


public class MainCitizen {
    public static void main(String[] args) {
        int citizens = 0;
        int students = 0;
        int anonymous = 0;
        Object[] objects = new Object[5];
        objects[0] = new Citizen("Bob", 31, "123", "30-10-1993");
        objects[1] = new Student("Tom", 19, "124", "31-12-2005", "100500");
        objects[2] = new Student("Ann", 20, "125", "31-20-2004", "100501");
        objects[3] = new Citizen("Tim", 84, "123", "13-01-1940");
        objects[4] = new Anonymous("31-12-2000");
        objects[4] = new Anonymous(null);

        for (Object item : objects){
            if (item instanceof Person){
                System.out.println(((Person)item).getName());
                if (item instanceof Citizen) citizens++;
                if (item instanceof Student) students++;
            }
            else anonymous++;
        }
        System.out.printf("\nCOUNT\nCitizens: %d\nStudents: %d\nAnonymous: %d",citizens,students,anonymous);


    }
}
