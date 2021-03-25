package com.facility.model.maintenance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface MaintenanceInterface {

    //getter and setters
    public String getMaintenanceId();

    public void setMaintenanceId(String maintenanceId);

    public List<MaintenanceRequest> listMaintenanceRequests();

    public List<MaintenanceOrder> listMaintenanceOrders();

    public List<MaintenanceLog> listMaintenanceLogs();

    public void addMaintenanceRequest(MaintenanceRequest request);

    public void addMaintenanceOrder(MaintenanceOrder order);

    public void addMaintenanceLog(MaintenanceLog log);

    public void removeMaintenanceRequest(MaintenanceRequest request);

    public void removeMaintenanceOrder(MaintenanceOrder order);

    public void removeMaintenanceLog(MaintenanceLog log);

    public Schedule listSchedule();

    public int calculateMaintenceCostForFacility();

    public int calculateProblemRateForFacility();

    public void makeFacilityMaintRequest(MaintenanceRequest req) ;

    public List<MaintenanceLog> listMaintenance();

    public void scheduleMaintenance(Date date, String scheduleContents);
}
