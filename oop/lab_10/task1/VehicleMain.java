package oop.lab_10.task1;



public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] mock = new Vehicle[3];
        mock[0] = new Car("Jaguar");
        mock[1] = new Bike("Stork");
        mock[2] = new Boat("Balloon");
        for (Object item : mock) {
            System.out.println(item.toString());
        }
    }
}
