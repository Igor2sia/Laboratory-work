package oop;

import static java.lang.String.format;

public class AppleTree {
    private String sort;
    private int age;

    AppleTree(String sort, int age) {
        setAge(age);
        setSort(sort);
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public void setSort(String sort) {
        if (sort.isEmpty()) {
            throw new IllegalArgumentException("sort musnt be null");
        }
        this.sort = sort;
    }

    public void addOneYear() {
        age++;
    }

    private int getProductivity() {
        if (age < 8) {
            return 0;
        } else if (age == 8) {
            return 50;
        } else {
            int yearsAfterEight = age - 8;
            int multiplier = yearsAfterEight / 2;
            int harvest = (int) (50 * Math.pow(1.5, multiplier - 1));
            return harvest;
        }
    }

    public String getInfo() {
        return format("%s gives %d kg of Apples per year", sort, getProductivity());
    }
}
