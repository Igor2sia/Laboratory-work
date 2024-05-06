package oop.lab_10.task;

public abstract class BaseVehicle implements Vehicle{
    private String model;
    private int tires;

    public BaseVehicle(String model) {
        setModel(model);
    }

    public void setModel(String model){
        if (model.isEmpty()) throw new IllegalArgumentException();
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getTires() {
        return tires;
    }
}
