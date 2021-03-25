package com.facility.model.facility;


import com.facility.model.facility.FacilityDetail;
import com.facility.model.use.Inspection;
import com.facility.model.maintenance.Maintenance;

import java.util.ArrayList;

import com.facility.model.use.Inspection;


import java.util.List;

public class Facility implements FacilityInterface {

    private String facilityId;
    private int availableCapacity;
    private int maxCapacity;
    private List<FacilityDetail> details;
    private List<Inspection> inspections;
    private FacilityLocation location;
    private Maintenance maintenance;

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

    public List<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(List<Inspection> inspections) {
        this.inspections = inspections;
    }

    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
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

    public String listFacilityProblems() {
        return maintenance.listMaintenanceLogs().toString();
    }



}
