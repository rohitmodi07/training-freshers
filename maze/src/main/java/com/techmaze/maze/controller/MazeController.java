package com.techmaze.maze.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techmaze.maze.model.MazeInfo;
import com.techmaze.maze.service.MazeService;

@RestController
public class MazeController {
	
	@Autowired
	private MazeService service;
	
	@GetMapping("/maze/{id}/{year}")
	public String getDetails(@RequestParam String personName, @PathVariable Map<String, String> map) {
		System.out.println("id is :::::"+map.get("id"));
		System.out.println("year is :::::"+map.get("year"));
		return service.getMazeDetails(personName);
		
	}
	
	@GetMapping("/maze/{id}/{month}")
	public String getMazeDetails(@RequestParam String personName, @PathVariable("id") String pId, @PathVariable String month) {
		System.out.println("id is :::::"+pId);
		System.out.println("year is :::::"+month);
		return service.getMazeDetails(personName);
		
	}
	
	@GetMapping("/maze/{id}")
	public String getMazeDetailsReq(@RequestParam Map<String, String> det, @PathVariable("id") String pId) {
		System.out.println("person name is :::::"+det.get("personName"));
		System.out.println("personLN is :::::"+det.get("personLN"));
		
		return service.getMazeDetails(det.get("personName"));
		
	}
	
	@PostMapping("/maze")
	public MazeInfo putMazeDetailsReq(@RequestBody MazeInfo mazeinfo) {
		
		System.out.println(" Received request :::::"+mazeinfo.toString());
		return mazeinfo;
	}

}
