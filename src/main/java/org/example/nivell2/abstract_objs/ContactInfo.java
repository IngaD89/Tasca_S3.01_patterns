package org.example.nivell2.abstract_objs;

import org.example.nivell2.models.Address;
import org.example.nivell2.models.Phone;

public record ContactInfo(Phone phone, Address address) {
    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone=" + phone +
                ", address=" + address +
                '}';
    }
}
