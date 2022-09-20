package com.crud.tasks.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AdminConfigTest {

    @Test
    void getterShouldBeNullTest() {

        //Given
        AdminConfig adminConfig = new AdminConfig();
        //When
        String adminMail = adminConfig.getAdminMail();
        //Then
        assertNull(adminMail);
    }
}