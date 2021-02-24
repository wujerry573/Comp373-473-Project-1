package com.facility.model;

public class FacilityLocation {
    // attributes
    private String locationId;
    private String street;
    private String unit;
    private String city;
    private String state;
    private String zip;

    // constructor
    public FacilityLocation() {}

    // setters
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // getters

    public String getLocationId() {
        return locationId;
    }

    public String getStreet() {
        return street;
    }

    public String getUnit() {
        return unit;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}
