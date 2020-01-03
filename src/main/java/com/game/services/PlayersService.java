package com.game.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.converters.PlayerConverter;
import com.game.dto.PlayersDto;
import com.game.entities.PlayersEntity;
import com.game.entities.TeamEntity;
import com.game.repositories.PlayersRepository;
import com.game.repositories.TeamRepository;

@Service
public class PlayersService {
	@Autowired
	private PlayersRepository playersRepository;

	@Autowired
	private TeamRepository teamRepository;

	public void createPlayer(Integer teamId, PlayersDto dto) throws Exception {

		TeamEntity entity = teamRepository.getbyId(teamId);
		if (entity == null) {
			throw new Exception("Team doesn't exist : " + teamId);
		} else {
			PlayersEntity ply = convert(dto);
			ply.setTeamEntity(entity);
			if (ply != null) {
				playersRepository.save(ply);
			}
		}

	}

	public PlayersEntity convert(PlayersDto dto) {
		PlayersEntity pe = null;
		if (dto != null) {
			pe = new PlayersEntity();
			pe.setAge(dto.getAge());
			pe.setId(dto.getId());
			pe.setName(dto.getName());
			pe.setPosition(dto.getPosition());

		}

		return pe;
	}

	public List<PlayersDto> getAllPlayerSList(Integer teamId) {
		List<PlayersEntity> listPlayer = playersRepository.getAllPlayer();
		List<PlayersDto> playerdto = new ArrayList<PlayersDto>();
		for (PlayersEntity pe : listPlayer) {
			PlayersDto dtos = PlayerConverter.convert(pe);
			playerdto.add(dtos);
		}
		return playerdto;
	}
}
