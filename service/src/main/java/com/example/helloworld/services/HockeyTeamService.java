package com.example.helloworld.services;

import com.example.helloworld.dto.TeamDto;
import org.apache.coyote.Response;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
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
