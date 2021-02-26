package com.test.model.facility;

import com.facility.model.facility.FacilityDetail;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacilityDetailTest {
    private FacilityDetail detail;

    @BeforeEach
    void setUp() {
        detail = new FacilityDetail();
        detail.setFacilityDetailId("1");
        detail.setDescription("Test Description");
    }

    @AfterEach
    void tearDown() {
        detail = null;
    }

    @Test
    void getFacilityDetailId() {
        assertEquals("1", detail.getFacilityDetailId());
    }

    @Test
    void getDescription() {
        assertEquals("Test Description", detail.getDescription());
    }
}