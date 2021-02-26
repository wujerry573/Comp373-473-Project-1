package com.test.model.use;

import com.facility.model.facility.Facility;
import com.facility.model.use.InspectionType;
import com.facility.model.use.UseSchedule;
import com.facility.model.use.Inspection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InspectionTest {
    private Inspection inspection;

    @BeforeEach
    void setUp() {
        UseSchedule useSchedule = new UseSchedule();
        useSchedule.setScheduleId("1");
        inspection = new Inspection(useSchedule);
        inspection.setInspectionId("1");
        inspection.setDate("2/25/21");
        Facility facility = new Facility();
        facility.setFacilityId("1");
        inspection.setFacility(facility);
        InspectionType type = new InspectionType();
        type.setInspectionTypeId("1");
        inspection.setType(type);

    }

    @AfterEach
    void tearDown() {
        inspection = null;
    }

    @Test
    void getInspectionId() {
        assertEquals("1", inspection.getInspectionId());
    }

    @Test
    void getFacility() {
        assertEquals("1", inspection.getFacility().getFacilityId());
    }

    @Test
    void getDate() {
        assertEquals("2/25/21", inspection.getDate());
    }

    @Test
    void getType() {
        assertEquals("1", inspection.getType().getInspectionTypeId());
    }

    @Test
    void testToString() {
        assertEquals("Inspection{inspectionId='1', facility='1', date='2/25/21', type='1', useSchedule='1'}", inspection.toString());
    }
}