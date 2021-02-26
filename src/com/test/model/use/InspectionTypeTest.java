package com.test.model.use;

import com.facility.model.use.InspectionType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InspectionTypeTest {
    private InspectionType type;

    @BeforeEach
    void setUp() {
        type = new InspectionType();
        type.setInspectionTypeId("1");
        type.setDescription("Type A Description");
        type.setName("Type A");
    }

    @AfterEach
    void tearDown() {
        type = null;
    }

    @Test
    void getInspectionTypeId() {
        assertEquals("1", type.getInspectionTypeId());
    }

    @Test
    void getName() {
        assertEquals("Type A", type.getName());
    }

    @Test
    void getDescription() {
        assertEquals("Type A Description", type.getDescription());
    }
}