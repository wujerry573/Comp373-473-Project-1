package com.facility.model.use;


import java.util.ArrayList;

public class UsageManagement implements UsageManagementInterface{
    public UsageManagement(){

    }
    private ArrayList<Usage> usagesList = new ArrayList<Usage>();

    public void addUsage(Usage u){
        this.usagesList.add(u);
    }

    public void removeUsage(Usage u){
        if(usagesList.contains(u)){
            this.usagesList.remove(u);
        }else{
            System.out.println("Usage not found");
        }
    }
    public void listActualUsage(){
        for(Usage u: usagesList){
            System.out.println(u.toString());
        }
    }

}
