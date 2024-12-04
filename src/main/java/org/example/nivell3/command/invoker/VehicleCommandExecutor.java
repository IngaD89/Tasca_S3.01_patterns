package org.example.nivell3.command.invoker;

import org.example.nivell3.command.cmd_object.Command;

import java.util.ArrayList;
import java.util.List;

public class VehicleCommandExecutor {
    private final List<Command> cmdOperations = new ArrayList<>();

    public void executeOperation(Command cmd) {
        cmdOperations.add(cmd);
        cmd.execute();
    }

}
