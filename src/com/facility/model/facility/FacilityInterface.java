package com.facility.model.facility;


import com.facility.model.maintenance.Maintenance;
import com.facility.model.use.Inspection;
import java.util.ArrayList;
import java.util.List;

public interface FacilityInterface {
    // getters and setters
    public String getFacilityId();

    public void setFacilityId(String facilityId);

    public int getAvailableCapacity();

    public void setAvailableCapacity(int availableCapacity) ;

    public int getMaxCapacity();

    public void setMaxCapacity(int maxCapacity);

    public List<FacilityDetail> getDetails();

    public void setDetails(List<FacilityDetail> details);

    public List<Inspection> getInpections();

    public void setInpections(List<Inspection> inpections);

    public FacilityLocation getLocation();

    public void setLocation(FacilityLocation location);

    // methods
    public List<FacilityDetail> getFacilityInformation();

    public List<Inspection> getInspections();

    public void setInspections(List<Inspection> inspections);

    public Maintenance getMaintenance();

    public void setMaintenance(Maintenance maintenance);

    public void addFacilityDetail(FacilityDetail detail);

    public int requestAvailableCapacity();

    public List<Inspection> listInspections();

    public String listFacilityProblems();



}
