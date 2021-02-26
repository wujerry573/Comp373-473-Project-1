package com.facility.model.maintenance;

import java.util.ArrayList;
import java.util.List;

public class Maintenance {

    private String maintenanceId;
    private List<MaintenanceRequest> maintenanceRequestList;
    private List<MaintenanceOrder> maintenanceOrderList;
    private List<MaintenanceLog> maintenanceLogList;
    private Schedule schedule;

    public Maintenance() {
        maintenanceLogList = new ArrayList<MaintenanceLog>();
        maintenanceOrderList = new ArrayList<MaintenanceOrder>();
        maintenanceRequestList = new ArrayList<MaintenanceRequest>();
        schedule = new Schedule();
    };

    //getter and setters
    public String getMaintenanceId() {return maintenanceId;}

    public void setMaintenanceId(String maintenanceId) {this.maintenanceId = maintenanceId;}

    public List<MaintenanceRequest> listMaintenanceRequests() {return maintenanceRequestList;}

    public List<MaintenanceOrder> listMaintenanceOrders() {return maintenanceOrderList;}

    public List<MaintenanceLog> listMaintenanceLogs() {return maintenanceLogList;}

    public void addMaintenanceRequest(MaintenanceRequest request) {maintenanceRequestList.add(request);}

    public void addMaintenanceOrder(MaintenanceOrder order) {maintenanceOrderList.add(order);}

    public void addMaintenanceLog(MaintenanceLog log) {maintenanceLogList.add(log);}

    public void removeMaintenanceRequest(MaintenanceRequest request) {maintenanceRequestList.remove(request);}

    public void removeMaintenanceOrder(MaintenanceOrder order) {maintenanceOrderList.remove(order);}

    public void removeMaintenanceLog(MaintenanceLog log) {maintenanceLogList.remove(log);}

    public Schedule listSchedule() {return schedule;}

    public int calculateMaintenceCostForFacility() {
        int totalCost = 0;
        for(int i = 0; i < maintenanceOrderList.size(); i++) {
            totalCost += maintenanceOrderList.get(i).getCost();
        }
        return totalCost;
    }

    public int calculateProblemRateForFacility() {
        return maintenanceRequestList.size() / maintenanceOrderList.size();
    }

}
