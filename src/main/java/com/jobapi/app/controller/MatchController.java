package com.jobapi.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobapi.app.dto.MatchResponse;
import com.jobapi.app.entity.JobDescription;
import com.jobapi.app.entity.Resume;
import com.jobapi.app.repository.JobRepository;
import com.jobapi.app.repository.ResumeRepository;
import com.jobapi.app.service.MatchService;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private ResumeRepository resumeRepo;

    @Autowired
    private JobRepository jobRepo;

    @Autowired
    private MatchService matchService;

    @GetMapping("/{resumeId}/{jobId}")
    public MatchResponse match(
            @PathVariable Long resumeId,
            @PathVariable Long jobId) {

        Resume resume =
            resumeRepo.findById(resumeId).orElseThrow();

        JobDescription job =
            jobRepo.findById(jobId).orElseThrow();

        return matchService.compareSkills(
                resume.getSkills(),
                job.getRequiredSkills());
    }
}