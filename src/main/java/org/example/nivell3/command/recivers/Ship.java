package org.example.nivell3.command.recivers;

public class Ship extends Vehicle {

    public Ship(String marc, String model, double speed) {
        super(marc, model, speed, VehicleType.SEA);
    }

    @Override
    public void start() {
        System.out.println("Arrancando barco");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerando barco");
    }

    @Override
    public void slowDown() {
        System.out.println("Frenando barco");
    }

}
