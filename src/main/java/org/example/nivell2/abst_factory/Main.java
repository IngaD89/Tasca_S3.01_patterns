package org.example.nivell2.abst_factory;

import org.example.nivell2.abst_factory.abstract_objs.ContactInfo;
import org.example.nivell2.abst_factory.abstract_objs.ContactInfoFactory;
import org.example.nivell2.abst_factory.models.Country;

public class Main {
    public static void main(String[] args) {

        ContactInfoFactory spainFactory = ContactInfoFactoryProvider.getFactory(Country.SPAIN);
        ContactInfo spainContactInfo = spainFactory.createContactInfo();
        System.out.println(spainContactInfo);

        ContactInfoFactory germanyFactory = ContactInfoFactoryProvider.getFactory(Country.GERMANY);
        ContactInfo germanyContactInfo = germanyFactory.createContactInfo();
        System.out.println(germanyContactInfo);
    }
}
