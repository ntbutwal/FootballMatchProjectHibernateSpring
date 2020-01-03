package com.game.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Matches")
public class MatcheEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Home_team_id")
	private int homeTeamid;

	@Column(name = "Away_team_id")
	private int awayTeamid;

	@Column(name = "Date")
	private Date date;

	@Column(name = "Location")
	private String location;

	@OneToOne
	@JoinColumn(name = "Away_team_id")
	private TeamEntity awayEntity;

	@OneToOne
	@JoinColumn(name = "Home_team_id")
	private TeamEntity homeEntity;

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

	public int getAwayTeamid() {
		return awayTeamid;
	}

	public void setAwayTeamid(int awayTeamid) {
		this.awayTeamid = awayTeamid;
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

	public TeamEntity getAwayEntity() {
		return awayEntity;
	}

	public void setAwayEntity(TeamEntity awayEntity) {
		this.awayEntity = awayEntity;
	}

	public TeamEntity getHomeEntity() {
		return homeEntity;
	}

	public void setHomeEntity(TeamEntity homeEntity) {
		this.homeEntity = homeEntity;
	}

}
