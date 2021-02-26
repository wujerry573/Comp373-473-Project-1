package com.test.model.facility;

import com.facility.model.facility.FacilityLocation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacilityLocationTest {
    private FacilityLocation location;

    @BeforeEach
    void setUp() {
        location = new FacilityLocation();
        location.setLocationId("1");
        location.setCity("Chicago");
        location.setState("IL");
        location.setStreet("123 Street");
        location.setUnit("1");
        location.setZip("60626");
    }

    @AfterEach
    void tearDown() {
        location = null;
    }

    @Test
    void getLocationId() {
        assertEquals("1", location.getLocationId());
    }

    @Test
    void getStreet() {
        assertEquals("123 Street", location.getStreet());
    }

    @Test
    void getUnit() {
        assertEquals("1", location.getUnit());
    }

    @Test
    void getCity() {
        assertEquals("Chicago", location.getCity());
    }

    @Test
    void getState() {
        assertEquals("IL", location.getState());
    }

    @Test
    void getZip() {
        assertEquals("60626", location.getZip());
    }
}