package com.game.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.game.dto.MatchDto;
import com.game.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {
	@Autowired
	private MatchService matchService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public MatchDto createMatchesById(@RequestBody MatchDto dto) {
		return matchService.createMatch(dto);

	}

}
