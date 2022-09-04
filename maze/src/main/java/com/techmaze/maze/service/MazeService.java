package com.techmaze.maze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmaze.maze.connector.MazeConnector;

@Service
public class MazeService {
	
	@Autowired
	private MazeConnector connector;
	
    public String getMazeDetails(String personName) {
    	
    	String mazeDetails = connector.getMazeDetails(personName);
		
		return mazeDetails;
	}

}
