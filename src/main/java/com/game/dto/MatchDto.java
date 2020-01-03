package com.game.dto;

import java.util.Date;

public class MatchDto {
	private Long id;
	private int homeTeamid;
	private int awayTeamId;
	private Date date;
	private String location;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHomeTeamid() {
		return homeTeamid;
	}

	public void setHomeTeamid(int homeTeamid) {
		this.homeTeamid = homeTeamid;
	}

	public int getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(int awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
