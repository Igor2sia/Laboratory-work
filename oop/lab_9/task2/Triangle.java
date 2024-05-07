package oop.lab_9.task2;

public class Triangle extends Polygon{

    public Triangle(int[] sides) throws Exception {
        super(sides);
        if (!isTriangle(sides)) throw new Exception("Invalid");
    }

    public double getInRadius(){
        double p = (this.sides[0] + this.sides[1] + this.sides[2]) / 2;
        double area = Math.pow(p*(p - this.sides[0])*(p - this.sides[1])*(p - this.sides[2]), 0.5);
        return Math.round(((2 * area) / (this.sides[0] + this.sides[1] + this.sides[2]))* 100.0) / 100.0;
    }

    public static boolean isTriangle(int[] sides){
        if (isCorrectPolygon(sides) && sides.length == 3) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Triangle contains " + getSidesCount() + " sides\n" +
                "Its perimeter is " + getPerimeter() + "\n" +
                "Its radius of incircle is " + getInRadius();    }
}
