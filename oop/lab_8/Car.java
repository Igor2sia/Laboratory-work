package oop.lab_8;

import static java.lang.String.format;

public class Car{
    private String make;
    private String model;
    private int horsePower;
//    make
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        if (make != null && !make.isBlank() && make.length() > 1)
            this.make = make;
    }
//    model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
//  horsepower
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        if (horsePower > 0)
            this.horsePower = horsePower;
        else throw new Error("Horse Power should be more than 0");
    }

    public Car(String make){
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car(String make, String model, int horsePower){
        this(make);
        this.setModel(model);
        this.setHorsePower(horsePower);
    }
    public String getInfo(){
        return format("The car is: %s %s - %d HP.", getMake(), getModel(), getHorsePower());
    }
}
