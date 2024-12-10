package org.example.nivell2.abst_factory.models;

public class Address {
    private String street;
    private String streetNum;
    private String floor;
    private String door;
    private String zipCode;
    private Country country;

    public Address(
            String street,
            String streetNum,
            String floor,
            String door,
            String zipCode,
            Country country
    ) {
        this.street = street;
        this.streetNum = streetNum;
        this.floor = floor;
        this.door = door;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNum='" + streetNum + '\'' +
                ", floor='" + floor + '\'' +
                ", door='" + door + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country=" + country +
                '}';
    }
}
