package org.example.nivell3.command.recivers;

public class Bicycle extends Vehicle {
    public Bicycle(String marc, String model, double speed) {
        super(marc, model, speed, VehicleType.LAND);
    }

    @Override
    public void start() {
        System.out.println("Arrancando bici");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerando bici");
    }

    @Override
    public void slowDown() {
        System.out.println("Frenando bici");
    }

}
