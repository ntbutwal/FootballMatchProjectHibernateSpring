package com.game.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.game.dto.TeamDto;

@RestController
@RequestMapping("/team")
public class TeamController {
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createTeam(@RequestBody TeamDto dto) {
		System.out.println(dto.toString());

	}

}
