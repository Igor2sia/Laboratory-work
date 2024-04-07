package oop;
import static java.lang.String.format;
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
    public void addOneYear(){
        age++;
    }

    private static int getProductivity(){
        if (age < 8){
            return 0;
            }
        else if (age == 8) {
            return 50;
        }
        else {
            int yearsAfterEight = age - 8;
            int multiplier = yearsAfterEight / 2;
            int harvest = (int) (50 * Math.pow(1.5, multiplier - 1));
            return harvest;
        }
    }
    public static String getInfo(){
        return format("%s gives %d kg of Apples per year", sort, getProductivity());
    }
}
