package com.techmaze.maze.connector;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Repository
public class MazeConnector {
	
	private RestTemplate template = new RestTemplate();
	
	
    public String getMazeDetails(String personName) {
    	
    	String personNationality = UriComponentsBuilder.fromHttpUrl("https://api.nationalize.io/")
    			.queryParam("name", personName).build().toString();
    	
    	String mazeDet = template.getForObject(personNationality, String.class);
		
		return mazeDet;
	}

}
