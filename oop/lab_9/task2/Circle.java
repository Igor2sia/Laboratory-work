package oop.lab_9.task2;

public class Circle extends Polygon{
    public Circle(int[] sides) throws Exception {
        super(sides);
        if (!isCircle(sides)) throw new Exception("Invalid");
    }
    public double getArea(){
        return (Math.round(Math.PI * Math.pow(sides[0], 2)));
    }
    public static boolean isCircle(int[] sides){
        if (sides.length == 1) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Circle radius is " + sides[0] +
                "\nIts perimeter " + (double) (Math.round(2 * getPerimeter() * Math.PI * 100.0) / 100.0) +
                "\nIts area is " + getArea();
    }
}
