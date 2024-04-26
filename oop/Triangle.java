package oop;
import static java.lang.Math.round;
import static java.lang.String.format;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC){
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            sideA *= -1;
        }
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
            sideB *= -1;
        }
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        if (sideC < 0){
            sideC *= -1;
        }
        this.sideC = sideC;
    }

    public int getArea(){
        int semiS = (sideA + sideB + sideC)/2;
        return (int) round(Math.sqrt(semiS*(semiS-sideA)*(semiS-sideB)*(semiS-sideC)));
    }
    public int getPerimeter(){
        return round(sideA + sideB + sideC);
    }
    public String getType(){
        String res = "";
        if (sideA == sideB && sideA == sideC){
            res = "Equilateral triangle ";
        }
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            res += "Isosceles triangle ";
        }
        if (sideA != sideB && sideA != sideC && sideB != sideC){
            res += "Scalene triangle ";
        }
        if (sideA > (sideB + sideC) || sideB > (sideA + sideC) || sideC > (sideA + sideB)){
            res += "Invalid triangle ";
        }
        if ((Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) || (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) || Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)){
            res += "Rectangular";
        }
        return res;
    }
    public String getInfoTriangle(){
        return format("Area = %d\nPerimeter = %d\n%s", getArea(), getPerimeter(), getType());
    }
}