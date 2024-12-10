package org.example.nivell2.abst_factory;

import org.example.nivell2.abst_factory.abstract_objs.ContactInfoFactory;
import org.example.nivell2.abst_factory.abst_impl.GermanyContactInfoImpl;
import org.example.nivell2.abst_factory.abst_impl.SpainContactInfoImpl;
import org.example.nivell2.abst_factory.models.Country;

public class ContactInfoFactoryProvider {

    public static ContactInfoFactory getFactory(Country country) {

        return switch (country) {
            case SPAIN -> new SpainContactInfoImpl();
            case GERMANY -> new GermanyContactInfoImpl();
        };
    }
}

