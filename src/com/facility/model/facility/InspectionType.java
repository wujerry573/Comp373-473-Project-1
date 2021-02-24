package com.facility.model;

public class InspectionType {

    private String inspectionTypeId;
    private String name;
    private String description;

    public InspectionType() {}

    public String getInspectionTypeId() {
        return inspectionTypeId;
    }

    public void setInspectionTypeId(String inspectionTypeId) {
        this.inspectionTypeId = inspectionTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
