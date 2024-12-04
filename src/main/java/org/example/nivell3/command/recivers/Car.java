package org.example.nivell3.command.recivers;

public class Car extends Vehicle {
    public Car(String marc, String model, double speed) {
        super(marc, model, speed, VehicleType.LAND);
    }

    @Override
    public void start() {
        System.out.println("Arrancando coche");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerando coche");
    }

    @Override
    public void slowDown() {
        System.out.println("Frenando coche");
    }

}
