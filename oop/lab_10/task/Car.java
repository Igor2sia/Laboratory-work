package oop.lab_10.task;

public class Car extends BaseVehicle{
    public Car(String model) {
        super(model);
    }

    @Override
    public int getTires() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("%d tires on car \"%s\"",getTires(),getModel());
    }
}
