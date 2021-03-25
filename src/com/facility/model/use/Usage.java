package com.facility.model.use;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityLocation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Usage implements UsageInterface{
    private int maxCapacity;
    private int reservationSize;
    private Facility facility;
    private FacilityLocation location;
    private ArrayList<Facility> facilities_In_Use = new ArrayList<Facility>();
    private boolean isInUse = false;
    private FacilityUser facilityUser;
    private UseSchedule useSchedule;

    public Usage(Facility specFacility){
        this.facility = specFacility;
        this.maxCapacity = specFacility.getMaxCapacity();
        this.location = specFacility.getLocation();
    }

    public Facility getFacility(){ return facility;}

    public int getMaxCapacity(){ return maxCapacity;}

    public int getReservationSize(){return reservationSize;}

    public void setReservationSize(){this.reservationSize = reservationSize;}

    public boolean isInUseDuringInterval(Date date, int duration){
        Date startTime = useSchedule.getStartDateTime();
        Date endTime = useSchedule.getEndDateTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, duration);
        Date reservationEnd = new Date();
        reservationEnd = calendar.getTime();

        boolean result = false;

        result = (startTime.compareTo(date) * endTime.compareTo(date)<0);
        return result;
    }

    public void assignFacilityToUse(Facility facility){
        facilities_In_Use.add(facility);
        System.out.println("Reservation Complete");
    }

    public void vacateFacility(Facility facility){
        facilities_In_Use.remove(facility);
        System.out.println("Facility is empty");
    }

    public void listActualUsage(){
        for (Facility facility: facilities_In_Use){
            System.out.println("Occupants: " + facility + " " + reservationSize + "people");
        }
    }

    public String calcUsageRate(){
        double useOfCapacity = reservationSize / maxCapacity;
        return "Usage Rate: " + (useOfCapacity * 100) + "%";
    }

}
