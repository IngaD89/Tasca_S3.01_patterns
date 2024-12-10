package org.example.nivell2.abst_factory.models;

public class Phone {
    private final String PREFIX;
    private String phoneNumber;
    private Country country;

    public Phone(
            String PREFIX,
            String phoneNumber,
            Country country
    ) {
        this.PREFIX = PREFIX;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    public String getPREFIX() {
        return PREFIX;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "PREFIX='" + PREFIX + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", country=" + country +
                '}';
    }
}
