package org.example.nivell2.abst_factory;

public abstract class Record {
    private RecordType type;
    private Country country;

    public Record(RecordType type, Country country) {
        this.type = type;
        this.country = country;
    }

    public RecordType getType() {
        return type;
    }

    public void setType(RecordType type) {
        this.type = type;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    abstract void create();

    @Override
    public String toString() {
        return "Record{" +
                "type=" + type +
                ", country=" + country +
                '}';
    }
}
