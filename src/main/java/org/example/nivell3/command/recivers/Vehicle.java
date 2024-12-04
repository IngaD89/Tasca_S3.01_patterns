package org.example.nivell3.command.recivers;

import org.example.nivell3.command.cmd_object.Command;

public class Vehicle {
    private String marc;
    private String model;
    private double speed;
    private VehicleType type;

    public Vehicle() {
    }

    public Vehicle(String marc, String model, double speed, VehicleType type) {
        this.marc = marc;
        this.model = model;
        this.speed = speed;
        this.type = type;
    }

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }


     public void start(){};

     public void accelerate(){};

     public void slowDown(){};


    @Override
    public String toString() {
        return "Vehicle{" +
                "marc='" + marc + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", type=" + type +
                '}';
    }
}
