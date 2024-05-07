package oop.lab_9.task2;

import java.util.Arrays;

public class Quadrilateral extends Polygon {
    public Quadrilateral(int[] sides) throws Exception {
        super(sides);
        if (!isQuadrilateral(sides)) throw new Exception("Invalid");
    }

    public static boolean isQuadrilateral(int[] sides) {
        if (sides.length == 4 && Polygon.isCorrectPolygon(sides)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Quadrilateral contains " + getSidesCount() + " sides\n" + "Its perimeter is " + getPerimeter();
    }
}
