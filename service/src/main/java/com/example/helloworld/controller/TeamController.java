package com.example.helloworld.controller;

import com.example.helloworld.services.HockeyTeamService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


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

    @GetMapping("/team/{id}")
    public String getTeamById(@PathVariable("id") Long id) {
        return hockeyTeamService.getTeamById(id);
    } 

    @GetMapping("/team/{id}/roster")
    public String getTeamRosterById(@PathVariable("id") Long id) {
        return hockeyTeamService.getTeamRosterById(id);
    }

    @GetMapping("/player/{id}")
    public String getPlayerById(@PathVariable("id") Long id) {
        return hockeyTeamService.getPlayerById(id);
    }

    @GetMapping("/stanley")
    public String stanleyCupWinners()
    {
        return hockeyTeamService.getCup();
    }
}
