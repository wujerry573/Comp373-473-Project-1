package com.facility.model.facility;

import java.util.List;

public class FacilityManager {

    private List<Facility> facilities;

    public FacilityManager() {};

    public List<Facility> listFacilities() {
        return facilities;
    }

    public void addNewFacility(Facility facility) {
        facilities.add(facility);
    }

    public void removeFacility(Facility facility){
        facilities.remove(facility);
    }
}
