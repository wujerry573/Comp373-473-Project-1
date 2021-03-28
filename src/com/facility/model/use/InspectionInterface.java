package com.facility.model.use;

import com.facility.model.facility.Facility;

public interface InspectionInterface {

    public void setUseSchedule(UseSchedule useSchedule);

    public UseSchedule getUseSchedule();

    public String getInspectionId();

    public void setInspectionId(String inspectionId);

    public Facility getFacility();

    public void setFacility(Facility facility);

    public String getDate();

    public void setDate(String date);

    public InspectionType getType();

    public void setType(InspectionType type);

}
