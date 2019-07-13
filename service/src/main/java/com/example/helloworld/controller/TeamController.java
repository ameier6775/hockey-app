package com.example.helloworld.controller;

import com.example.helloworld.model.HockeyTeam;
import com.example.helloworld.services.HockeyTeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TeamController {

    private HockeyTeamService hockeyTeamService;

    public TeamController(HockeyTeamService hockeyTeamService) {
        this.hockeyTeamService = hockeyTeamService;
    }

    @GetMapping("/team")
    public String getTeams()
    {
        return hockeyTeamService.getTeams();
    }

    @GetMapping("/stanley")
    public String stanleyCupWinners()
    {
        return hockeyTeamService.getCup();
    }
}
