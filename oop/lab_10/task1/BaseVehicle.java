package oop.lab_10.task1;

public abstract class BaseVehicle implements Vehicle{
    private String model;
    protected int tires;

    public BaseVehicle(String model) {
        setModel(model);
        setTires(tires);
    }

    public void setModel(String model){
        if (model == null || model.isEmpty()) throw new IllegalArgumentException();
        this.model = model;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    @Override
    public String getModel() {
        return model;
    }
}
