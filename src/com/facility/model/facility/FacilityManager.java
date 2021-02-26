package com.facility.model.facility;

import com.facility.model.facility.Facility;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> b3a9272902205bbbe5b997c7d17af5c65e14e5d5
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

}
