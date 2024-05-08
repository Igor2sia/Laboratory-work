package oop.lab_9.task1;

import oop.lab_9.task1.Vehicle;

public class Boat extends Vehicle {

    private int oarsCount;

    public Boat(int passengers, int oarsCount) {
        super(passengers);
        setPassengers(passengers);
        setOarsCount(oarsCount);
    }

    private void setOarsCount(int oarsCount) {
        if (oarsCount < 0) throw new IllegalArgumentException("Invalid negative number! Argument: oars count");
        if (oarsCount == 0) throw new IllegalArgumentException("Need oars to swim!");
        if (oarsCount > passengers * 2) throw new IllegalArgumentException("One too many oars!");
        this.oarsCount = oarsCount;
    }

    @Override
    public String toString() {
        return String.format("In a Boat %d passengers with %d oars",passengers,oarsCount);
    }
}
