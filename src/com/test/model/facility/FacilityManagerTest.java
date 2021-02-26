package com.test.model.facility;

import com.facility.model.facility.FacilityManager;
import com.facility.model.facility.Facility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacilityManagerTest {
    private FacilityManager manager;

    @BeforeEach
    void setUp() {
        manager = new FacilityManager();
        Facility facility = new Facility();
        manager.addNewFacility(facility);

    }

    @AfterEach
    void tearDown() {
        manager = null;
    }

    @Test
    void listFacilities() {
        assertEquals(1, manager.listFacilities().size());
    }

    @Test
    void addNewFacility() {
        assertEquals(1, manager.listFacilities().size());
        manager.addNewFacility(new Facility());
        assertEquals(2, manager.listFacilities().size());
    }

    @Test
    void removeFacility() {
        assertEquals(1, manager.listFacilities().size());
        manager.removeFacility(manager.listFacilities().get(0));
        assertEquals(0, manager.listFacilities().size());
    }
}