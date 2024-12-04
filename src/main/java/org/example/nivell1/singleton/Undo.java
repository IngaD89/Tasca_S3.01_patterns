package org.example.nivell1.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undo {
    private final Scanner scanner = new Scanner(System.in);
    private List<String> commandList;
    private String command;

    private static Undo newInstance;

    private Undo() {
        commandList = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (newInstance == null) {
            newInstance = new Undo();
        }
        return newInstance;
    }

    private String createCommand() {
        System.out.println("Para ayuda con comandos marca - help - ");

        do {
            System.out.print("~ % ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("help")) {
                System.out.println("Para salir de terminal marca - exit - ");
            }

            commandList.add(command);

        } while (!command.equalsIgnoreCase("exit"));

        return command;
    }

    private void deleteCommand(String command) {
        commandList.removeIf(cmd -> cmd.equalsIgnoreCase(command));
    }

    private void getCommandHistory() {
        for (String command : commandList) {
            System.out.println(command);
        }
    }

    public void menu() {
        int option = 0;

        do {
            System.out.println("""
                    Escoge una opción:
                    0. Exit
                    1. Abrir terminal
                    2. Eliminar comando
                    3. Listar comandos
                    """);

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0 -> System.out.println("Exit");
                case 1 -> createCommand();
                case 2 -> {
                    System.out.println("Introduce commando a eliminar");
                    String command = scanner.nextLine();
                    deleteCommand(command);
                }
                case 3 -> getCommandHistory();
            }

        } while (option != 0);

    }

}
