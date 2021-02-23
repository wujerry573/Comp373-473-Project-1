package com.facility.model.facility.maintenance;

import java.util.List;

public class MaintenanceLog {

    private List<Maintenance> maintenanceLogs;

    private List<Maintenance> maintenanceRequests;

    public MaintenanceLog() {};

    public List<Maintenance> listMaintLogs() {return maintenanceLogs;}

    public List<Maintenance> listMaintRequests() {return maintenanceRequests;}

    public void addMaintLog(Maintenance maintenance) {maintenanceLogs.add(maintenance);}

    public void removeMaintLog(Maintenance maintenance) {maintenanceLogs.remove(maintenance);}

    public void addMaintRequest(Maintenance maintenance) {maintenanceRequests.add(maintenance);}

    public void removeMaintRequest(Maintenance maintenance) {maintenanceRequests.remove(maintenance);}

}
