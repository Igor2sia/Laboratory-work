package oop.lab_10.task1;

public class Boat extends BaseVehicle{
    public Boat(String model) {
        super(model);
    }

    @Override
    public int getTires() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%d tires on boat \"%s\"",getTires(),getModel());
    }
}
