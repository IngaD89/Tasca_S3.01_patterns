package org.example.nivell2.abst_factory.abstract_objs;

import org.example.nivell2.abst_factory.models.Phone;
import org.example.nivell2.abst_factory.models.Address;

public record ContactInfo(Phone phone, Address address) {
    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone=" + phone +
                ", address=" + address +
                '}';
    }
}
