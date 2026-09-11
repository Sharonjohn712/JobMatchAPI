package com.jobapi.app.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JobDescriptionTest {

    @Test
    void defaultConstructorCreatesEmptyObject() {
        JobDescription job = new JobDescription();

        assertNull(job.getId());
        assertNull(job.getTitle());
        assertNull(job.getRequiredSkills());
    }

    @Test
    void allArgsConstructorSetsFields() {
        JobDescription job = new JobDescription(1L, "Java Developer", "Java, Spring Boot, SQL");

        assertEquals(1L, job.getId());
        assertEquals("Java Developer", job.getTitle());
        assertEquals("Java, Spring Boot, SQL", job.getRequiredSkills());
    }
}
