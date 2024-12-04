package org.example.nivell3.command.recivers;

public class Plane extends Vehicle {
    public Plane(String marc, String model, double speed) {
        super(marc, model, speed, VehicleType.SKY);
    }

    @Override
    public void start() {
        System.out.println("Arrancando avion");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerando avion");
    }

    @Override
    public void slowDown() {
        System.out.println("Frenando avion");
    }

}
