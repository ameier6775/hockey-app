package edu.ameier.hockey.controller;

import edu.ameier.hockey.models.User;
import edu.ameier.hockey.services.HockeyTeamService;
import edu.ameier.hockey.services.UserService;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TeamController {

    private UserService userService;
    private HockeyTeamService hockeyTeamService;

    public TeamController(HockeyTeamService hockeyTeamService, UserService userService) {
        this.hockeyTeamService = hockeyTeamService;
        this.userService = userService;
    }

    @GetMapping
    public String getTeams() throws IOException
    {
        return hockeyTeamService.getTeams();
    }

    @GetMapping("/team/{id}")
    public String getTeamById(@PathVariable("id") Long id) {
        return hockeyTeamService.getTeamById(id);
    }

    @GetMapping("/team/player/{id}")
    public String getPlayerById(@PathVariable("id") Long id) {return hockeyTeamService.getPlayerById(id); }

    @PostMapping("/signup")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/team/{id}/roster")
    public String getTeamRosterById(@PathVariable("id") Long id) {
        return hockeyTeamService.getTeamRosterById(id);
    }

    @GetMapping("/stanley")
    public String stanleyCupWinners()
    {
        return hockeyTeamService.getCup();
    }
}
