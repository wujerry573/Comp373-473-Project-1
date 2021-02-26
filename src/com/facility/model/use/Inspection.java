package com.facility.model.use;

import com.facility.model.facility.Facility;

public class Inspection {

    private String inspectionId;
    private Facility facility;
    private String date;
    private InspectionType type;
    private UseSchedule useSchedule;

    public Inspection(UseSchedule useSchedule) {
        this.useSchedule = useSchedule;
    };

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
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
                ", facility='" + facility.getFacilityId() + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type.getInspectionTypeId() + '\'' +
                ", useSchedule='" + useSchedule.getScheduleId() + '\'' +
                '}';
    }
}
