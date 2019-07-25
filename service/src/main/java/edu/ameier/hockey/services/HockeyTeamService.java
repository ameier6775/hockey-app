package com.example.helloworld.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class HockeyTeamService {
    public String getTeams()
    {
        final String url = "https://statsapi.web.nhl.com/api/v1/teams";
        return getHttpRestResponse(url);
    }
    public String getCup()
    {
        final String url = "https://records.nhl.com/site/api/trophy";
        return getHttpRestResponse(url);
    }
    public String getTeamById(Long id) {
        String teamId = id.toString();
        final String url = "https://statsapi.web.nhl.com/api/v1/teams/" + teamId;
        return getHttpRestResponse(url);
    }
    
    public String getTeamRosterById(Long id) {
        String teamId = id.toString();
        final String url = "https://statsapi.web.nhl.com/api/v1/teams/" + teamId + "?expand=team.roster";
        return getHttpRestResponse(url);
    }

    public String getPlayerById(Long id) {
        String playerId = id.toString();
        final String url = "https://statsapi.web.nhl.com/api/v1/people/" + playerId;
        return getHttpRestResponse(url);

    }
    // public String getSeasonStatsForPlayer(Long id, Long anotherId) {
    //     String playerId = id.toString();
    //     String seasonId = anotherId.toString();
    //     final String url = "https://statsapi.web.nhl.com/api/v1/people/" + playerId + "/stats?stats=yearByYear";
    //     return getHttpRestResponse(url);
    // }

    private String getHttpRestResponse(String url)
    {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        ResponseEntity<String> response = restTemplate.exchange(url,
                HttpMethod.GET, null, new ParameterizedTypeReference<>() {});

        return response.getBody();
    }
}
