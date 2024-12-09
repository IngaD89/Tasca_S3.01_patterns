package org.example.nivell2.abst_factory_2;

import org.example.nivell2.abstract_objs.abst_impl.GermanyContactInfoImpl;
import org.example.nivell2.abstract_objs.abst_impl.SpainContactInfoImpl;

public class Main {
    public static void main(String[] args) {

        SpainContactInfoImpl spain = new SpainContactInfoImpl();
        spain.creteContactInfo();

        System.out.println(spain);

        GermanyContactInfoImpl germany = new GermanyContactInfoImpl();
        germany.creteContactInfo();

        System.out.println(germany);
    }
}
