package edu.ameier.hockey.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ameier.hockey.dto.TeamDto;
import edu.ameier.hockey.models.HockeyTeam;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class HockeyTeamService {
    private RestTemplateService restTemplateService;

    public HockeyTeamService(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }
    public String getTeams() throws IOException
    {
        final String url = "https://statsapi.web.nhl.com/api/v1/teams";
        String body = restTemplateService.getHttpRestResponse(url);

//        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        TeamDto[] team = mapper.readValue(body, TeamDto[].class);
        return body;
    }
    public String getCup()
    {
        final String url = "https://records.nhl.com/site/api/trophy";
        return restTemplateService.getHttpRestResponse(url);
    }
    public String getTeamById(Long id) {
        String teamId = id.toString();
        final String url = "https://statsapi.web.nhl.com/api/v1/teams/" + teamId;
        return restTemplateService.getHttpRestResponse(url);
    }
    
    public String getTeamRosterById(Long id) {
        String teamId = id.toString();
        final String url = "https://statsapi.web.nhl.com/api/v1/teams/" + teamId + "?expand=team.roster";
        return restTemplateService.getHttpRestResponse(url);
    }

    public String getPlayerById(Long id) {
        String playerId = id.toString();
        final String url = "https://statsapi.web.nhl.com/api/v1/people/" + playerId;
        return restTemplateService.getHttpRestResponse(url);

    }
    // public String getSeasonStatsForPlayer(Long id, Long anotherId) {
    //     String playerId = id.toString();
    //     String seasonId = anotherId.toString();
    //     final String url = "https://statsapi.web.nhl.com/api/v1/people/" + playerId + "/stats?stats=yearByYear";
    //     return getHttpRestResponse(url);
    // }

//    private String getHttpRestResponse(String url)
//    {
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        ResponseEntity<String> response = restTemplate.exchange(url,
//                HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
//
//        return response.getBody();
//    }
}
