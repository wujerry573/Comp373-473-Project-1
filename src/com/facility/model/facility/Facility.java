package com.facility.model.facility;

import com.facility.model.facility.FacilityDetail;
import com.facility.model.use.Inspection;

import java.util.ArrayList;
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
