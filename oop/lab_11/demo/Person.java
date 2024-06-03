package oop.lab_11.demo;

import java.io.Serializable;

public class Person implements Serializable{




    class Gender implements Serializable{
        private static final String MALE = "man";
        private static final String FEMALE = "woman";
        private String gender = MALE;

        public Gender(String gender) {
            if (gender != null && gender instanceof String && (gender.equalsIgnoreCase(MALE)) || gender.equalsIgnoreCase(FEMALE)) {
                this.gender = gender;
            }
        }

    }
    private String surname;
    private String name;
    private String patronymic;
    private transient int year;

    private Gender gender;

    public Person(String surname, String name, String patronymic, int year) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
    }

    public Person(String surname, String name, String patronymic, int year, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.gender = new Gender(gender);
    }

    public String toGenderString() {
        if ("man".equals(gender.toString()))return String.format("Уважаемый %s %s!",name ,patronymic);
        else if (gender.equals("woman"))return String.format("Уважаемая %s %s!",name ,patronymic);
        return "";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", surname, name, patronymic, year);
    }
}
