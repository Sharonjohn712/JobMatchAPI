package com.jobapi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobapi.app.entity.JobDescription;

@Repository
public interface JobRepository
        extends JpaRepository<JobDescription, Long> {
}