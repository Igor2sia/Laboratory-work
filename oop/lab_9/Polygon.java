package oop.lab_9;

public class Polygon {
    protected int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    public int getSidesCount(int[] sides){
        return sides.length;
    }

    public int getPerimeter(int[] sides){
        int perimeter = 0;
        for (int i : sides){
            perimeter += sides[i];
        }
        return perimeter;
    }
    public static boolean isCorrectSide(int[] sides){
        boolean flag = true;
        for (int i : sides){
            if (i <= 1) flag = false; throw new IllegalArgumentException("side mustnt be 0");
        }
        return flag;
    }
}
