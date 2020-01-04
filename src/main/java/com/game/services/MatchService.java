package com.game.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dto.MatchDto;
import com.game.entities.MatcheEntity;
import com.game.entities.TeamEntity;
import com.game.repositories.MatchRepository;
import com.game.repositories.TeamRepository;

@Service
public class MatchService {
	@Autowired
	private MatchRepository matchRepository;

	@Autowired
	private TeamRepository teamRepository;

	public MatchDto createMatch(MatchDto dto) {
		TeamEntity awayteam = teamRepository.getbyId(dto.getAwayTeamId());
		TeamEntity homeTeam = teamRepository.getbyId(dto.getHomeTeamid());
		
		MatcheEntity mt = new MatcheEntity();
		mt.setAwayEntity(awayteam);
		mt.setHomeEntity(homeTeam);
		mt.setDate(new Date());
		mt.setLocation(dto.getLocation());

		return convert(matchRepository.saveMatches(mt));

	}

	public MatchDto convert(MatcheEntity entity) {
		MatchDto mtch = null;
		if (entity != null) {
			mtch = new MatchDto();
			mtch.setDate(new Date());
			mtch.setLocation(entity.getLocation());
			mtch.setId(entity.getId());
		}
		return mtch;

	}

}
