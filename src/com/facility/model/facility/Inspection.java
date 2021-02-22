package com.facility.model.facility;

public class Inspection {

    private String inspectionId;
    private String facility;
    private String date;
    private InspectionType type;

    public Inspection() {};

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public InspectionType getType() {
        return type;
    }

    public void setType(InspectionType type) {
        this.type = type;
    }
}
