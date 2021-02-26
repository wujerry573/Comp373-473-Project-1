package com.test.model.use;

import com.facility.model.use.FacilityUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacilityUserTest {
    private FacilityUser user;

    @BeforeEach
    void setUp() {
        user = new FacilityUser("1", "firstName", "lastName", "18001234567",
                "123 Test St, Chicago, IL, 60626");
    }

    @AfterEach
    void tearDown() {
        user = null;
    }

    @Test
    void getUserId() {
        assertEquals("1", user.getUserId());
    }

    @Test
    void getFirstName() {
        assertEquals("firstName", user.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("lastName", user.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("18001234567", user.getPhoneNumber());
    }

    @Test
    void getAddress() {
        assertEquals("123 Test St, Chicago, IL, 60626", user.getAddress());
    }
}