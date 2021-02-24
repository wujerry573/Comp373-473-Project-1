package com.facility.model.use;

public class Inspection {

    private String inspectionId;
    private String facility;
    private String date;
    private InspectionType type;
    private UseSchedule useSchedule;

    public Inspection(UseSchedule useSchedule) {};

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

    @Override
    public String toString() {
        return "Inspection{" +
                "inspectionId='" + inspectionId + '\'' +
                ", facility='" + facility + '\'' +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", useSchedule=" + useSchedule +
                '}';
    }
}
