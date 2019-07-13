package com.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HockeyTeam {
    private String teamName;
    private String city;
    private boolean favored;
}
