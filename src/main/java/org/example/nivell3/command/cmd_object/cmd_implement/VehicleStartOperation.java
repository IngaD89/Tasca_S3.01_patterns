package org.example.nivell3.command.cmd_object.cmd_implement;

import org.example.nivell3.command.cmd_object.Command;
import org.example.nivell3.command.recivers.Vehicle;

public class VehicleStartOperation implements Command {

    private Vehicle vehicle;

    public VehicleStartOperation(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
