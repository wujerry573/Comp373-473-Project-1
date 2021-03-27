package com.facility.model.maintenance;

public interface MaintenanceOrderInterface {

    public String getMaintenanceOrderId();
    public void setMaintenanceOrderId(String maintenanceOrderId);
    public String getDescription();
    public void setDescription(String description);
    public int getCost();
    public void setCost(int cost);
}
