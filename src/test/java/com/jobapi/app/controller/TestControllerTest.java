package com.jobapi.app.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestControllerTest {

    @Test
    void helloReturnsExpectedStatusMessage() {
        TestController controller = new TestController();

        assertEquals("Resume Job Match API is running!", controller.hello());
    }
}
