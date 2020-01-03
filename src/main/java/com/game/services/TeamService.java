package com.game.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.ConditionalConverter;
import org.springframework.stereotype.Service;

import com.game.dto.TeamDto;
import com.game.entities.TeamEntity;
import com.game.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public TeamDto createTeam(TeamDto teamDto) {
		TeamEntity teamEntity = new TeamEntity();
		teamEntity.setCountry(teamDto.getCountry());
		teamEntity.setCreatedAt(new Date());
		teamEntity.setLogo(teamDto.getLogo());
		teamEntity.setManager(teamDto.getManager());
		teamEntity.setName(teamDto.getName());
		teamEntity.setUpdatedAt(new Date());

		return convert(teamRepository.senddata(teamEntity));

	}

	public TeamDto convert(TeamEntity teamEntity) {
		TeamDto dto = null;
		if (teamEntity != null) {
			dto = new TeamDto();
			dto.setCountry(teamEntity.getCountry());
			dto.setCreatedAt(teamEntity.getCreatedAt());
			dto.setLogo(teamEntity.getLogo());
			dto.setManager(teamEntity.getManager());
			dto.setName(teamEntity.getName());
			dto.setUpdatedAt(teamEntity.getUpdatedAt());
			dto.setId(teamEntity.getId());

		}
		return dto;
	}

	public List<TeamDto> getAllTeamList() {
		List<TeamEntity> list = teamRepository.getAllTeam();
		List<TeamDto> dtos = new ArrayList<TeamDto>();
		for (TeamEntity te : list) {
			TeamDto dt = convert(te);
			dtos.add(dt);
		}
		return dtos;

	}
}
