package oop.lab_9.task2;

public class Polygon {
    protected int[] sides;

    public Polygon(int[] sides) throws Exception {
        if (!(isCorrectPolygon(sides))) throw new Exception("Invalid side.");
        this.sides = sides;
    }

    public int getSidesCount(){
        return this.sides.length;
    }

    public int getPerimeter(){
        int perimeter = 0;
        for (int x : this.sides) perimeter += x;
        return perimeter;
    }
    public static boolean isCorrectSide(int x){
        return x >= 1;
    }
    public static boolean isCorrectPolygon(int[] sides){
        if (sides.length == 1) return true; //todo
        int sum = 0;
        int max = sides[0];
        for (int x : sides){
            if (!(isCorrectSide(x))) return false;
            sum += x;
            if (max < x) max = x;
        }
        sum -= max;
        if (max > sum) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Polygon contains %d sides\nIts perimeter is %d",getSidesCount(), getPerimeter());
    }
}
