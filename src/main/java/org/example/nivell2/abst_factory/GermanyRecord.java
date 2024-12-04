package org.example.nivell2.abst_factory;

import java.util.Scanner;

public class GermanyRecord implements RecordAbstractFactory{
    private final Scanner scanner = new Scanner(System.in);
    private final String PREFIX = "+49";



    @Override
    public PhoneRecord createPhoneRecord() {
        System.out.println("Introduce numero de telefono");
        String phone = scanner.nextLine();
        PhoneRecord record = new PhoneRecord(RecordType.PHONE, Country.GERMAN, (PREFIX + phone));
        System.out.println(record);
        return record;
    }

    @Override
    public AddressRecord createAddressRecord() {

        System.out.println("Introduce nombre de calle");
        String street = scanner.nextLine();

        System.out.println("Introduce numero de calle");
        String streetNumber = scanner.nextLine();

        System.out.println("Introduce numero de planta");
        String floor = scanner.nextLine();

        System.out.println("Introduce numero de puerta");
        String door = scanner.nextLine();
        System.out.println("Introduce codigo postal");
        String zipcode = scanner.nextLine();


        return new AddressRecord(
                RecordType.ADDRESS,
                Country.GERMAN,
                street,
                streetNumber,
                floor,
                door,
                zipcode
        );
    }
}
