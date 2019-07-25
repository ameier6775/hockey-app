package edu.ameier.hockey.controller;

import edu.ameier.hockey.dto.TeamDto;
import edu.ameier.hockey.models.HockeyTeam;
import edu.ameier.hockey.services.HockeyTeamService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/team")
public class TeamController {

    private HockeyTeamService hockeyTeamService;

    public TeamController(HockeyTeamService hockeyTeamService) {
        this.hockeyTeamService = hockeyTeamService;
    }

    @GetMapping
    public String getTeams() throws IOException
    {
        return hockeyTeamService.getTeams();
    }

    @GetMapping("/{id}")
    public String getTeamById(@PathVariable("id") Long id) {
        return hockeyTeamService.getTeamById(id);
    }

    //TODO: Put thing into Player Controller, if needed.
    @GetMapping("/player/{id}")
    public String getPlayerById(@PathVariable("id") Long id) {return hockeyTeamService.getPlayerById(id); }

    @GetMapping("/{id}/roster")
    public String getTeamRosterById(@PathVariable("id") Long id) {
        return hockeyTeamService.getTeamRosterById(id);
    }

    @GetMapping("/stanley")
    public String stanleyCupWinners()
    {
        return hockeyTeamService.getCup();
    }
}
