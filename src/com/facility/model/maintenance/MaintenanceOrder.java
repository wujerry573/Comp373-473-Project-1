package com.facility.model.maintenance;

public class MaintenanceOrder {

    private int maintenanceOrderId;
    private String description;

    public MaintenanceOrder() {};

    public int getMaintenanceOrderId() {return maintenanceOrderId;}

    public void setMaintenanceOrderId(int maintenanceOrderId) {this.maintenanceOrderId = maintenanceOrderId;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
}
