package org.example.nivell3.command;

import org.example.nivell3.command.cmd_object.cmd_implement.VehicleAccelerateOperation;
import org.example.nivell3.command.cmd_object.cmd_implement.VehicleSlowDownOperation;
import org.example.nivell3.command.cmd_object.cmd_implement.VehicleStartOperation;
import org.example.nivell3.command.invoker.VehicleCommandExecutor;
import org.example.nivell3.command.recivers.*;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Marca", "Model", 70);
        Vehicle bike = new Bicycle("Marca", "Model", 70);
        Vehicle plane = new Plane("Marca", "Model", 70);
        Vehicle ship = new Ship("Marca", "Model", 70);

        VehicleCommandExecutor executor = new VehicleCommandExecutor();

        executor.executeOperation(new VehicleStartOperation(bike));
        executor.executeOperation(new VehicleAccelerateOperation(car));
        executor.executeOperation(new VehicleSlowDownOperation(plane));
        executor.executeOperation(new VehicleSlowDownOperation(ship));
    }
}
