package org.example.nivell2.abst_factory.abst_impl;

import org.example.nivell2.abst_factory.abstract_objs.ContactInfo;
import org.example.nivell2.abst_factory.models.Phone;
import org.example.nivell2.abst_factory.abstract_objs.ContactInfoFactory;
import org.example.nivell2.abst_factory.models.Address;
import org.example.nivell2.abst_factory.models.Country;

public class GermanyContactInfoImpl implements ContactInfoFactory {

    final String PREFIX = "+49";
    String phoneNumber = "345679082";
    String street = "germany street";
    String streetNum = "56A";
    String floor = "2";
    String door = "4b";
    String zipCode = "23405";

    @Override
    public ContactInfo createContactInfo() {
        return new ContactInfo(
                new Phone(PREFIX, phoneNumber, Country.GERMANY),
                new Address(street, streetNum, floor, door, zipCode, Country.GERMANY)
                );
    }

    @Override
    public String toString() {
        return "GermanyContactInfoImpl{" +
                this.createContactInfo() + '\'' +
                '}';
    }
}
