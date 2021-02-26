package com.facility.view;

import com.facility.model.FacilityManager;
import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetail;
import com.facility.model.facility.FacilityLocation;

public class Client {
    public static void main(String args[]) throws Exception{
        Facility facility1 = new Facility();
//        facility1.setFacilityName("Granada Center"); need facility name to distinguish
        facility1.setFacilityId("1");
        facility1.setAvailableCapacity(100);

        FacilityLocation facilityLocation = new FacilityLocation();
        facility1.setLocation(facilityLocation);
        facilityLocation.setLocationId("1");
        facilityLocation.setStreet("6439 N Sheridan Rd");
        facilityLocation.setUnit("Suite 310");
        facilityLocation.setCity("Chicago");
        facilityLocation.setState("IL");
        facilityLocation.setZip("60626");

        Facility facility2 = new Facility();
//        facility2.setFacilityName("Terry Student Center"); need facility name to distinguish
        facility2.setFacilityId("2");
        facility2.setAvailableCapacity(200);
        FacilityLocation facilityLocation2 = new FacilityLocation();
        facility2.setLocation(facilityLocation);
        facilityLocation2.setLocationId("2");
        facilityLocation2.setStreet("26 E. Pearson");
        facilityLocation2.setUnit("Suite 250");
        facilityLocation2.setCity("Chicago");
        facilityLocation2.setState("IL");
        facilityLocation2.setZip("60611");

        FacilityDetail facilityDetail1 = new FacilityDetail();
        facilityDetail1.setFacilityDetailId("Granada Center");
        facilityDetail1.setDescription("Loyola University Lake Shore campus wellness center location. ");

        FacilityDetail facilityDetail2 = new FacilityDetail();
        facilityDetail2.setFacilityDetailId("Terry Student Center");
        facilityDetail2.setDescription("Loyola University Water Tower campus wellness center location. ");

        addFacilityTest(facility1);
        System.out.println();
        addFacilityTest(facility2);
        System.out.println();

        addFacilityDetailTest(facility1);
        addFacilityDetailTest(facility2);
        System.out.println();
        System.out.println("Current capacity: " + getCapacityTest(facility1));
        System.out.println("Current capacity: " + getCapacityTest(facility2));
        System.out.println();

        System.out.println(facility1.getFacilityDetail());
        System.out.println(facility2.getFacilityDetail());
    }

    public static void addFacilityTest(Facility facility){
        FacilityManager facilityManagement= new FacilityManager();
        facilityManagement.addNewFacility(facility);
        facilityManagement.listFacilities();
        System.out.println("New facility have been added. ");
    }

    public static void addFacilityDetailTest(Facility facility, FacilityDetail){
        facility.addFacilityDetail(FacilityDetail);
    }

    public static int getCapacityTest(Facility facility){
        FacilityManager facilityManager= new FacilityManager();
        return facilityManager.requestAvailableCapacity(facility);
    }

}