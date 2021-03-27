package com.facility.model.maintenance;

public class MaintenanceRequest implements MaintenanceRequestInterface {

    private String maintenanceRequest;
    private String maintenanceRequestId;

    public MaintenanceRequest() {};

    public String getMaintenanceRequest() {return maintenanceRequest;}

    public void setMaintenanceRequest(String maintenanceRequest) {this.maintenanceRequest = maintenanceRequest;}

    public String getMaintenanceRequestId() {return maintenanceRequestId;}

    public void setMaintenanceRequestId(String maintenanceRequestId) {this.maintenanceRequestId = maintenanceRequestId;}

}
