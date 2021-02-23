package com.facility.model.use;
import java.util.ArrayList;
import java.util.List;

public class InspectionManagement {
    public InspectionManagement (){

    }
    private ArrayList<Inspection> inspectionList = new ArrayList<Inspection>();

    public ArrayList<Inspection> getInspectionsList(){ return inspectionList; }

    public void setInspectionList(ArrayList<Inspection>inspectionList){
       this.inspectionList = inspectionList;
    }
    public void addInspection(Inspection inspection){ inspectionList.add(inspection)}

    public void listInspections(){
        for (Inspection inspect: inspectionList){
            System.out.println(inspect.toString());
        }
    }

}
