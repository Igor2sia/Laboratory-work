package oop.lab_9.task2;

public class EquilateralTriangle extends IsoscelesTriangle{
    public EquilateralTriangle(int[] sides) throws Exception {
        super(sides);
        if (!isEquilateralTriangle(sides)) throw new Exception("Invalid");
    }

    public static boolean isEquilateralTriangle(int[] sides){
        if (sides[0] == sides[1] && sides[0] == sides[2])return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Equilateral triangle contains "
                + getSidesCount() + " equal sides\n" +
                "Its perimeter " + getPerimeter() + "\n" +
                "Its radius of incicrle is " + getInRadius();
    }
}
