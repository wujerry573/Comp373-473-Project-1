package com.facility.view;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetail;
import com.facility.model.facility.FacilityLocation;
import com.facility.model.maintenance.Maintenance;
import com.facility.model.maintenance.MaintenanceOrder;
import com.facility.model.maintenance.MaintenanceRequest;
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

        //Spring initialize maintenance order
        MaintenanceOrder maintenanceOrder = (MaintenanceOrder) context.getBean("maintenanceOrder");
        maintenanceOrder.setMaintenanceOrderId("123");
        maintenanceOrder.setDescription("Fixing the lights");
        maintenanceOrder.setCost(2000);

        //Spring initialize maintenance request
        MaintenanceRequest maintenanceRequest = (MaintenanceRequest) context.getBean("maintenanceRequest");
        maintenanceRequest.setMaintenanceRequestId("A32R");
        maintenanceRequest.setMaintenanceRequest("Replace the water filter");

        //Spring initialize Maintenance
        Maintenance maintenance = (Maintenance) context.getBean("maintenance");
        maintenance.setMaintenanceId("1");
        maintenance.addMaintenanceOrder(maintenanceOrder);
        maintenance.addMaintenanceRequest(maintenanceRequest);

        //Spring initialize Inspecption


        //Spring initialize Facility
        Facility facility1 = (Facility) context.getBean("facility");
        facility1.setFacilityId("1");
        facility1.setAvailableCapacity(100);
        facility1.setLocation(facilityLocation);
        facility1.addFacilityDetail(facilityDetail1);
        facility1.setMaintenance(maintenance);



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
        //Print out all maintenance requests
        System.out.println("Facility Maintenance Requests:");
        Maintenance maintenance1 = facility1.getMaintenance();
        List<MaintenanceRequest> maintenanceRequests = maintenance1.listMaintenanceRequests();
        for(MaintenanceRequest request: maintenanceRequests) {
            System.out.println("\t\t" + request.getMaintenanceRequest());
        }
        //print out all current maintenance orders
        System.out.println("Facility Maintenance Orders:");
        List<MaintenanceOrder> orders = maintenance1.listMaintenanceOrders();
        for(MaintenanceOrder order: orders) {
            System.out.println("\t\t" + order.getDescription());
            System.out.println("\t\t$" + order.getCost());
        }
    }
}
