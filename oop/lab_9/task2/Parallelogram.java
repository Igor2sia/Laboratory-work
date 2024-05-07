package oop.lab_9.task2;

import java.util.Arrays;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(int[] sides) throws Exception {
        super(sides);
        if (!isParallelogram(sides)) throw new Exception("Invalid");
    }

    public static boolean isParallelogram(int[] sides) {
        if (isQuadrilateral(sides) && sides[0] == sides[2] && sides[1] == sides[3]) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Parallelogram contains two pairs parallel sides\n" + "Its perimeter is " + getPerimeter();
    }
}
