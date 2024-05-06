package oop.lab_10.task;

public class Bike extends BaseVehicle{
    public Bike(String model) {
        super(model);
    }

    @Override
    public int getTires() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("%d tires on bike \"%s\"",getTires(),getModel());
    }
}
