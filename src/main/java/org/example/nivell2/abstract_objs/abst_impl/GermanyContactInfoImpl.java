package org.example.nivell2.abstract_objs.abst_impl;

import org.example.nivell2.abstract_objs.ContactInfo;
import org.example.nivell2.abstract_objs.ContactInfoFactory;
import org.example.nivell2.models.Address;
import org.example.nivell2.models.Country;
import org.example.nivell2.models.Phone;

public class GermanyContactInfoImpl implements ContactInfoFactory {

    final String PREFIX = "+49";
    String phoneNumber = "345679082";
    String street = "germany street";
    String streetNum = "56A";
    String floor = "2";
    String door = "4b";
    String zipCode = "23405";

    @Override
    public ContactInfo creteContactInfo() {
        return new ContactInfo(
                new Phone(PREFIX, phoneNumber, Country.GERMANY),
                new Address(street, streetNum, floor, door, zipCode, Country.GERMANY)
                );
    }

    @Override
    public String toString() {
        return "GermanyContactInfoImpl{" +
                this.creteContactInfo() + '\'' +
                '}';
    }
}
