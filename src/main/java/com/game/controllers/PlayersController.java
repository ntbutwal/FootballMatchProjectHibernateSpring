package com.game.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.dto.PlayersDto;
import com.game.dto.TeamDto;
import com.game.entities.PlayersEntity;
import com.game.entities.TeamEntity;
import com.game.services.PlayersService;

@RestController
@RequestMapping("/player")
public class PlayersController {

	@Autowired
	private PlayersService playersService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addPlayer(@RequestParam(value = "") Integer teamId, @RequestBody PlayersDto dto) throws Exception {
		playersService.createPlayer(teamId, dto);

	}

	@RequestMapping(value = "playerlist", method = RequestMethod.GET)
	public List<PlayersDto> getAllPlayesrFromTeam(@RequestParam(value = "") Integer teamId) {
		return playersService.getAllPlayerSList(teamId);

	}

}
