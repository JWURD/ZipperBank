package io.zipcoder;

public class Address {
    Long id;
    String streetName;
    String city;
    String state;
    String zip;

    public Address(Long id, String streetName, String city, String state, String zip) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
