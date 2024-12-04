package org.example.nivell2.abst_factory;

public class AddressRecord extends Record{
    private String street;
    private String streetNum;
    private String floor;
    private String door;
    private String zipcode;


    public AddressRecord(
            RecordType type,
            Country country,
            String street,
            String streetNum,
            String floor,
            String door,
            String zipcode
    ) {
        super(type, country);
        this.street = street;
        this.streetNum = streetNum;
        this.floor = floor;
        this.door = door;
        this.zipcode = zipcode;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    void create() {
        new AddressRecord(super.getType(), super.getCountry(), street, streetNum, floor, door, zipcode);
    }
}
