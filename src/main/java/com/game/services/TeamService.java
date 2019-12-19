package com.game.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.dto.TeamDto;
import com.game.entities.TeamEntity;
import com.game.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public void createTeam(TeamDto teamDto) {
		TeamEntity teamEntity = new TeamEntity();
		teamEntity.setCountry(teamDto.getCountry());
		teamEntity.setCreatedAt(new Date());
		teamEntity.setLogo(teamDto.getLogo());
		teamEntity.setManager(teamDto.getManager());
		teamEntity.setName(teamDto.getName());
		teamEntity.setUpdatedAt(new Date());
		
		teamRepository.save(teamEntity);

	}
}
