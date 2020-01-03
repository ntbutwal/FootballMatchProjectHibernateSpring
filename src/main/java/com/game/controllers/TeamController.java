package com.game.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.dto.TeamDto;
import com.game.services.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public TeamDto createTeam(@RequestBody TeamDto dto) {
		return teamService.createTeam(dto);

	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<TeamDto> getall(@RequestParam(required = false) Integer id){
		return teamService.getAllTeamList();
		
	}

}
