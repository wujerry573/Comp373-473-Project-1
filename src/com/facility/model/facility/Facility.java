package com.facility.model.facility;

<<<<<<< HEAD
import com.facility.model.facility.FacilityDetail;
import com.facility.model.use.Inspection;

import java.util.ArrayList;
=======
import com.facility.model.use.Inspection;

>>>>>>> b3a9272902205bbbe5b997c7d17af5c65e14e5d5
import java.util.List;

public class Facility {

    private String facilityId;
    private int availableCapacity;
    private int maxCapacity;
    private List<FacilityDetail> details;
    private List<Inspection> inspections;
    private FacilityLocation location;

    public Facility() {
        details = new ArrayList<FacilityDetail>();
        inspections = new ArrayList<Inspection>();
    };

    // getters and setters
    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<FacilityDetail> getDetails() {
        return details;
    }

    public void setDetails(List<FacilityDetail> details) {
        this.details = details;
    }

    public List<Inspection> getInpections() {
        return inspections;
    }

    public void setInpections(List<Inspection> inpections) {
        this.inspections = inpections;
    }

    public FacilityLocation getLocation() {
        return location;
    }

    public void setLocation(FacilityLocation location) {
        this.location = location;
    }

    // methods
    public List<FacilityDetail> getFacilityInformation(){
        return details;
    }

    public void addFacilityDetail(FacilityDetail detail) {
        details.add(detail);
    }

    public int requestAvailableCapacity() {
        return availableCapacity;
    }

    public List<Inspection> listInspections() {
        return inspections;
    }



}
