package com.facility.model.maintenance;

public interface MaintenanceOrderInterface {

    public int getMaintenanceOrderId();
    public void setMaintenanceOrderId(int maintenanceOrderId);
    public String getDescription();
    public void setDescription(String description);
    public int getCost();
    public void setCost(int cost);
}
