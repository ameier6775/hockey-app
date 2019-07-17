package com.example.helloworld.dto;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamDto {
    private long id;
    private String name;
    private String teamName;
    // private List<Player> roster;
}
