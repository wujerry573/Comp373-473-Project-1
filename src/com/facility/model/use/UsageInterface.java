package com.facility.model.use;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityLocation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public interface UsageInterface {

    public Facility getFacility();

    public int getMaxCapacity();

    public int getReservationSize();

    public void setReservationSize();

    public boolean isInUseDuringInterval(Date date, int duration);

    public void assignFacilityToUse(Facility facility);

    public void vacateFacility(Facility facility);

    public void listActualUsage();

    public String calcUsageRate();

}
