package com.facility.model.facility;

import java.util.ArrayList;
import java.util.List;

public interface FacilityManagerInterface {

    public List<Facility> listFacilities();

    public void addNewFacility(Facility facility);

    public void removeFacility(Facility facility);

    public int requestAvailableCapacity(Facility facility);

}
