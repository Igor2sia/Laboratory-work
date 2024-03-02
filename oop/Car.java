package oop;

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
        this.horsePower = horsePower;
    }
    public Car(String make){
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car(String make, String model, int horsePower){
        this(make);
        this.model = model;
        this.horsePower = horsePower;
    }
    public String getInfo(){
        return format("The car is: %s %s - %d HP.", make, model, horsePower);
    }
}
