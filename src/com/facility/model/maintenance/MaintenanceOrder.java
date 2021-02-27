package com.facility.model.maintenance;

public class MaintenanceOrder {

    private int maintenanceOrderId;
    private String description;
    private int cost;

    public MaintenanceOrder() {};

    public int getMaintenanceOrderId() {return maintenanceOrderId;}

    public void setMaintenanceOrderId(int maintenanceOrderId) {this.maintenanceOrderId = maintenanceOrderId;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getCost() {return cost;}

    public void setCost(int cost) {this.cost = cost;}
}
