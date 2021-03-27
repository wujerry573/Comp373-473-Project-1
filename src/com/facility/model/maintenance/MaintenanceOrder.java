package com.facility.model.maintenance;

public class MaintenanceOrder implements MaintenanceOrderInterface {

    private String maintenanceOrderId;
    private String description;
    private int cost;

    public MaintenanceOrder() {};

    public String getMaintenanceOrderId() {return maintenanceOrderId;}

    public void setMaintenanceOrderId(String maintenanceOrderId) {this.maintenanceOrderId = maintenanceOrderId;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getCost() {return cost;}

    public void setCost(int cost) {this.cost = cost;}
}
