package org.example.nivell2.abst_factory.abst_impl;

import org.example.nivell2.abst_factory.abstract_objs.ContactInfo;
import org.example.nivell2.abst_factory.models.Country;
import org.example.nivell2.abst_factory.models.Phone;
import org.example.nivell2.abst_factory.abstract_objs.ContactInfoFactory;
import org.example.nivell2.abst_factory.models.Address;

public class SpainContactInfoImpl implements ContactInfoFactory {

    final String PREFIX = "+34";
    String phoneNumber = "642522205";
    String street = "Concordia";
    String streetNum = "32";
    String floor = "2";
    String door = "4";
    String zipCode = "08004";

    @Override
    public ContactInfo createContactInfo() {
        return new ContactInfo(
                new Phone(PREFIX, phoneNumber, Country.SPAIN),
                new Address(street, streetNum, floor, door, zipCode, Country.SPAIN)
        );
    }

    @Override
    public String toString() {
        return "SpainContactInfoImpl{" +
                 this.createContactInfo() + '\'' +
                '}';
    }
}
