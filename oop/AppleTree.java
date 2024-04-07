package oop;

public class AppleTree {
    private static String sort;
    private static int age;

    public static void setAge(int age){
        AppleTree.age = age;
    }

    public static void setSort(String sort) {
        AppleTree.sort = sort;
    }

    AppleTree(String sort, int age){
        AppleTree.age = age;
        AppleTree.sort = sort;
    }

    private static int getProductivity(){
        if (age >= 8){
            int adulthood = Math.abs(8 - age);
            int common = 0;
            if (adulthood % 2 == 0){
                common = adulthood / 2;
            }
        }
    }
}
