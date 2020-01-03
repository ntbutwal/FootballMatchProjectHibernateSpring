package com.game.converters;

import com.game.dto.PlayersDto;
import com.game.entities.PlayersEntity;

public class PlayerConverter {
	
	public static PlayersEntity convert(PlayersDto pdto) {
		PlayersEntity ent= null;
		if(pdto!=null){
			ent= new PlayersEntity();
			ent.setAge(pdto.getAge());
			ent.setName(pdto.getName());
			ent.setPosition(pdto.getPosition());
			
		}
		return ent;
	}
	
	public static PlayersDto convert(PlayersEntity pent) {
		PlayersDto dto= null;
		if(pent!=null){
			dto= new PlayersDto();
			dto.setAge(pent.getAge());
			dto.setId(pent.getId());
			dto.setName(pent.getName());
			dto.setPosition(pent.getPosition());
		}
		return dto;
	}

}
