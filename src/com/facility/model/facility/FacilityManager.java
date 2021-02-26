package com.facility.model.facility;

import com.facility.model.facility.Facility;

import java.util.ArrayList;

import java.util.List;

public class FacilityManager {

    private List<Facility> facilities;

    public FacilityManager() {
        facilities = new ArrayList<Facility>();
    };

    public List<Facility> listFacilities() {
        return facilities;
    }

    public void addNewFacility(Facility facility) {
        facilities.add(facility);
    }

    public void removeFacility(Facility facility){
        facilities.remove(facility);
    }

    public int requestAvailableCapacity(Facility facility) { return facility.requestAvailableCapacity(); }

}
