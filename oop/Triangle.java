package oop;
import static java.lang.Math.round;
import static java.lang.String.format;

public class Triangle {
    private static int sideA;
    private static int sideB;
    private static int sideC;

    public static void setSideA(int sideA) {
        Triangle.sideA = sideA;
    }

    public static void setSideB(int sideB) {
        Triangle.sideB = sideB;
    }

    public static void setSideC(int sideC) {
        Triangle.sideC = sideC;
    }
    public Triangle(int sideA, int sideB, int sideC){
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }
    public static int getArea(){
        int semiS = (sideA + sideB + sideC)/2;
        return (int) round(Math.sqrt(semiS*(semiS-sideA)*(semiS-sideB)*(semiS-sideC)));
    }
    public static int getPerimeter(){
        return round(sideA + sideB + sideC);
    }
    public static String getType(){
        String res = "";
        if (sideA == sideB && sideA == sideC){
            res = "Equilateral triangle ";
        }
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            res += "Isosceles triangle";
        }
        if (sideA != sideB && sideA != sideC && sideB != sideC){
            res = "Scalene triangle";
        }
        if (sideA > (sideB + sideC) || sideB > (sideA + sideC) || sideC > (sideA + sideB)){
            res = "Invalid triangle";
        }
        if ((Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) || (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) || Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)){
            res = "Rectangular";
        }
        return res;
    }
    public static String getInfoTriangle(){
        return format("Area = %d\nPerimeter = %d\n%s", getArea(), getPerimeter(), getType());
    }
}