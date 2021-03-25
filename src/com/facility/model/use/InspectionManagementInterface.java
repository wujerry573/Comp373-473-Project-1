package com.facility.model.use;
import java.util.ArrayList;

public interface InspectionManagementInterface {

    public ArrayList<Inspection> getInspectionsList();

    public void setInspectionList(ArrayList<Inspection>inspectionList);
    public void addInspection(Inspection inspection);
    public void listInspections();

}
