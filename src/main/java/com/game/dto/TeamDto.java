package com.game.dto;

public class TeamDto {

	private String name;
	private String country;
	private String manager;
	private String logo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "TeamDto [name=" + name + ", country=" + country + ", manager=" + manager + ", logo=" + logo + "]";
	}

}
