package oop.lab_9.task2;

import java.util.Arrays;

public class Rhombus extends Parallelogram {
    public Rhombus(int[] sides) throws Exception {
        super(sides);
        if (!isRhombus(sides)) throw new Exception("Invalid");
    }

    public static boolean isRhombus(int[] sides) {
        if (isQuadrilateral(sides) && sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Rhombus contains " + getSidesCount() + " equal sides\n" + "Its perimeter is " + getPerimeter();
    }
}
