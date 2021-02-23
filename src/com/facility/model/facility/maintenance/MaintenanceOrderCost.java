package com.facility.model.facility.maintenance;

public class MaintenanceOrderCost {

    private int maintenanceCost;
    private int problemRate;

    public int getMaintenanceCost() {return maintenanceCost;}

    public int getProblemRate() {return problemRate;}

    public void setMaintenanceCost(int maintenanceCost) {this.maintenanceCost = maintenanceCost;}

    public void setProblemRate(int problemRate) {this.problemRate = problemRate;}

    //math.round is placeholder for actual calculation
    public int calcMaintenanceCostForFacility() {return Math.round(maintenanceCost);}

    public int calcProblemRateForFacility() {return Math.round(problemRate);}
}