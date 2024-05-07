package oop.lab_9.task2;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(int[] sides) throws Exception {
        super(sides);
        if (!isIsoscelesTriangle(sides)) throw new Exception("Invalid");
    }

    public static boolean isIsoscelesTriangle(int[] sides){
        if (isTriangle(sides) && sides[0] == sides[1] || sides[0] == sides[3] || sides[2] == sides[3]) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Isoscels triangle contains pair of equal sides\n" +
                "Its perimeter is " + getPerimeter() + "\n" +
                "Its radius of incircle is " + getInRadius();    }
}
