package com.jobapi.app.service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jobapi.app.dto.MatchResponse;

@Service
public class MatchService {

    public MatchResponse compareSkills(
            String resumeSkills,
            String jobSkills) {

        Set<String> resumeSet =
                Arrays.stream(resumeSkills.split(","))
                      .map(String::trim)
                      .collect(Collectors.toSet());

        Set<String> jobSet =
                Arrays.stream(jobSkills.split(","))
                      .map(String::trim)
                      .collect(Collectors.toSet());

        List<String> matched =
                jobSet.stream()
                      .filter(resumeSet::contains)
                      .toList();

        List<String> missing =
                jobSet.stream()
                      .filter(skill -> !resumeSet.contains(skill))
                      .toList();

        double percentage =
                (double) matched.size()
                / jobSet.size() * 100;

        return new MatchResponse(percentage, matched, missing);
    }
}