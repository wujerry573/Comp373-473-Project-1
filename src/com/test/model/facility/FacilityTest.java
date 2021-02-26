package com.test.model.facility;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityLocation;
import com.facility.model.facility.FacilityDetail;
import com.facility.model.use.Inspection;
import com.facility.model.use.UseSchedule;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class FacilityTest {
    private Facility facility;

    @BeforeEach
    void setUp() {
        facility = new Facility();
        facility.setFacilityId("1");
        facility.setAvailableCapacity(0);
        facility.setMaxCapacity(10);

        FacilityLocation location = new FacilityLocation();
        location.setLocationId("1");

        facility.setLocation(location);

        FacilityDetail detail = new FacilityDetail();
        detail.setFacilityDetailId("1");

        facility.addFacilityDetail(detail);

        Inspection inspection = new Inspection(new UseSchedule());
        ArrayList<Inspection> inspections = new ArrayList<Inspection>();
        inspections.add(inspection);
        facility.setInpections(inspections);


    }

    @AfterEach
    void tearDown() {
        facility = null;
    }

    @Test
    void getFacilityId() {
        assertEquals("1", facility.getFacilityId());
    }

    @Test
    void getAvailableCapacity() {
        assertEquals(0, facility.getAvailableCapacity());
    }

    @Test
    void getMaxCapacity() {
        assertEquals(10, facility.getMaxCapacity());
    }

    @Test
    void getDetails() {
        assertEquals("1", facility.getDetails().get(0).getFacilityDetailId());
    }

    @Test
    void getInpections() {
        assertEquals(1, facility.getInpections().size());
    }

    @Test
    void getLocation() {
        assertEquals("1", facility.getLocation().getLocationId());
    }

    @Test
    void getFacilityInformation() {
        assertEquals("1", facility.getFacilityInformation().get(0).getFacilityDetailId());
    }

    @Test
    void addFacilityDetail() {
        FacilityDetail detail = new FacilityDetail();
        detail.setFacilityDetailId("2");

        assertEquals(1, facility.getFacilityInformation().size());
        facility.addFacilityDetail(detail);
        assertEquals(2, facility.getFacilityInformation().size());

    }

    @Test
    void requestAvailableCapacity() {
        assertEquals(0, facility.getAvailableCapacity());
    }

    @Test
    void listInspections() {
        assertEquals(1, facility.listInspections().size());
    }
}