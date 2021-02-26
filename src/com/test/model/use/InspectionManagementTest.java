package com.test.model.use;

import com.facility.model.use.InspectionManagement;
import com.facility.model.use.Inspection;
import com.facility.model.use.UseSchedule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InspectionManagementTest {
    private InspectionManagement management;

    @BeforeEach
    void setUp() {
        management = new InspectionManagement();
        UseSchedule useSchedule = new UseSchedule();
        useSchedule.setScheduleId("1");
        Inspection inspection = new Inspection(useSchedule);
        inspection.setInspectionId("1");
        management.addInspection(inspection);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getInspectionsList() {
        assertEquals(1, management.getInspectionsList().size());
    }

    @Test
    void addInspection() {
        assertEquals(1, management.getInspectionsList().size());
        management.addInspection(management.getInspectionsList().get(0));
        assertEquals(2, management.getInspectionsList().size());
    }

    @Test
    void listInspections() {
    }
}