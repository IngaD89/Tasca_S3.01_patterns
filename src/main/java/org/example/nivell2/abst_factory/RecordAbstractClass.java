package org.example.nivell2.abst_factory;

import java.util.Scanner;

public class RecordAbstractClass {
    private final GermanyRecord germanyRecord = new GermanyRecord();

    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        int option = 0;

        do {

            System.out.println("""
                    Escoge una opción:
                    0. Exit
                    1. Añadir nuevo registro
                    2. Listar Registros
                    """);

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    int opt = 0;
                    System.out.println("""
                            Escoge pais:
                            1. Alemania
                            2. Italia
                            3. No encuentro pais, salirde programa
                            """);
                    opt = scanner.nextInt();
                    scanner.nextLine();
                    switch (opt) {
                        case 3 -> System.out.println("Adios");
                        case 1 -> {
                            germanyRecord.createPhoneRecord();
                            germanyRecord.createAddressRecord();
                        }
                        case 2 -> System.out.println("Implementacion proximamente");
                    }

                    break;
                case 2:
                    System.out.println("Implementacion de listar proximamente");
                    break;
            }

        } while (option != 0);
    }
}
