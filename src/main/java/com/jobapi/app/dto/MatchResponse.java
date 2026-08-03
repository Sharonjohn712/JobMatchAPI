package com.jobapi.app.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class MatchResponse {

    private double matchPercentage;
    private List<String> matchedSkills;
    private List<String> missingSkills;
}