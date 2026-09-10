package com.jobapi.app.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ResumeTest {

    @Test
    void defaultConstructorCreatesEmptyObject() {
        Resume resume = new Resume();

        assertNull(resume.getId());
        assertNull(resume.getCandidateName());
        assertNull(resume.getSkills());
    }

    @Test
    void allArgsConstructorSetsFields() {
        Resume resume = new Resume(2L, "Alice Smith", "Java, REST, AWS");

        assertEquals(2L, resume.getId());
        assertEquals("Alice Smith", resume.getCandidateName());
        assertEquals("Java, REST, AWS", resume.getSkills());
    }
}
