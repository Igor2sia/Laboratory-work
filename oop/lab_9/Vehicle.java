package oop.lab_9;
public class Vehicle {
    protected int passengers;

    protected Vehicle(int passengers) {
        setPassengers(passengers);
    }

    protected void setPassengers(int passengers) {
        if (passengers < 0) throw new IllegalArgumentException("Invalid negative number! Argument: passengers");
        if (passengers == 0) throw new IllegalArgumentException("Need passengers to drive!");
        this.passengers = passengers;
    }
}
