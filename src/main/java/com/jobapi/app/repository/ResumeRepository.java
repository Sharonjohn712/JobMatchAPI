package com.jobapi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobapi.app.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long>{

}
