package com.facility.view;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetail;
import com.facility.model.facility.FacilityLocation;
import com.facility.model.maintenance.Maintenance;
import com.facility.model.maintenance.MaintenanceOrder;
import com.facility.model.maintenance.MaintenanceRequest;
import com.facility.model.use.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
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

        //Spring initialize Facility
        Facility facility1 = (Facility) context.getBean("facility");
        facility1.setFacilityId("1");
        facility1.setMaxCapacity(5000);
        facility1.setAvailableCapacity(100);
        facility1.setLocation(facilityLocation);
        facility1.addFacilityDetail(facilityDetail1);
        facility1.setMaintenance(maintenance);

        //Spring initialize usages
        Usage usage1 = (Usage) context.getBean("usage");
        usage1.setFacility(facility1);
        usage1.setReservationSize(1000);

        Usage usage2 = (Usage) context.getBean("usage");
        usage2.setFacility(facility1);
        usage2.setReservationSize(500);

        UsageManagement usageManagement1 = (UsageManagement) context.getBean("usageManagement");
        usageManagement1.addUsage(usage1);
        usageManagement1.addUsage(usage2);

        //Spring initialize Inspections and UseSchedule
        UseSchedule useSchedule1 = (UseSchedule) context.getBean("useSchedule");
        useSchedule1.setScheduleId("234GD");
        useSchedule1.setUserId("G.Smith");
        useSchedule1.setUnitId("23HEJF");
        useSchedule1.setStartDateTime(new Date(1999,2,3,4,5,6));
        useSchedule1.setEndDateTime(new Date(2000,2,3,4,5,6));

        InspectionType inspectionType1 = (InspectionType) context.getBean("inspectionType");
        inspectionType1.setInspectionTypeId("23AF2");
        inspectionType1.setDescription("Annual Inspection");
        inspectionType1.setName("George Smith");

        Inspection inspection1 = (Inspection) context.getBean("inspection");
        inspection1.setFacility(facility1);
        inspection1.setDate("4/23/2021");
        inspection1.setInspectionId("5F");
        inspection1.setType(inspectionType1);
        inspection1.setUseSchedule(useSchedule1);

        InspectionManagement inspectionManagement1 = (InspectionManagement) context.getBean("inspectionManagement");
        inspectionManagement1.addInspection(inspection1);

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
        //Print out all current maintenance orders
        System.out.println("Facility Maintenance Orders:");
        List<MaintenanceOrder> orders = maintenance1.listMaintenanceOrders();
        for(MaintenanceOrder order: orders) {
            System.out.println("\t\t" + order.getDescription() + ": $"+ order.getCost());
        }
        //Print out all facility usages
        System.out.println("Facility Usages:");
        usageManagement1.listActualUsage();
        //Print out all inspections
        System.out.println("Facility Inspections:");
        inspectionManagement1.listInspections();

    }
}
