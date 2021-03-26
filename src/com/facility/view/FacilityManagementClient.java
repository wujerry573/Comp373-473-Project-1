package com.facility.view;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetail;
import com.facility.model.facility.FacilityLocation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FacilityManagementClient {
    public static void main (String args[]) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Spring initializes facility location
        FacilityLocation facilityLocation = (FacilityLocation) context.getBean("facilityLocation");
        facilityLocation.setLocationId("1");
        facilityLocation.setStreet("6439 N Sheridan Rd");
        facilityLocation.setUnit("Suite 310");
        facilityLocation.setCity("Chicago");
        facilityLocation.setState("IL");
        facilityLocation.setZip("60626");

        //Spring initialize facility detail
        FacilityDetail facilityDetail1 = (FacilityDetail) context.getBean("facilityDetail");
        facilityDetail1.setFacilityDetailId("Granada Center");
        facilityDetail1.setDescription("Loyola University Lake Shore campus wellness center location. ");

        //Spring initialize Facility
        Facility facility1 = (Facility) context.getBean("facility");
        facility1.setFacilityId("1");
        facility1.setAvailableCapacity(100);
        facility1.setLocation(facilityLocation);
        facility1.addFacilityDetail(facilityDetail1);



        //Print facility information
        System.out.println("********** Facility ********** ");
        System.out.println("Facility Id:\t\t" + facility1.getFacilityId());
        System.out.println("Available Capacity:\t\t" + facility1.getAvailableCapacity());
        //Print facility1 location
        System.out.println("Facility Location:");
        System.out.println("\t\t" + facility1.getLocation().getStreet() + "\n\t\t" + facility1.getLocation().getCity()
                + ", " + facility1.getLocation().getState() + " " + facility1.getLocation().getZip());
        System.out.println("Facility Detail:");
        //Print all details in facility1
        List<FacilityDetail> details = facility1.getDetails();
        for (FacilityDetail detail : details) {
            System.out.println("\t\t" + detail.getDescription());
        }

    }
}
