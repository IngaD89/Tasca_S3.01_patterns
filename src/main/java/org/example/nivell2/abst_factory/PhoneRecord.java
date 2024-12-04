package org.example.nivell2.abst_factory;

public class PhoneRecord extends Record{
    private String value;

    public PhoneRecord(RecordType type, Country country, String value) {
        super(type, country);
        this.value = value;
    }

    @Override
    void create() {
        new PhoneRecord(super.getType(), super.getCountry(), this.value);
    }

    @Override
    public String toString() {
        return "PhoneRecord{" +
                "value='" + value + '\'' +
                '}';
    }
}
