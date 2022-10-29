package com.Ultimobaile.TibiaApiGuild.domains;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Guild {

	@JsonProperty("name")
	public String name;
	
	@JsonProperty("world")
    public String world;
	@JsonProperty("logo_url")
    public String logo_url;
	@JsonProperty("description")
    public String description;
	@JsonProperty("guildhalls")
    public ArrayList<Guildhall> guildhalls;
	@JsonProperty("active")
    public boolean active;
	@JsonProperty("founded")
    public String founded;
	@JsonProperty("open_applications")
    public boolean open_applications;
	@JsonProperty("homepage")
    public String homepage;
	@JsonProperty("in_war")
    public boolean in_war;
	@JsonProperty("disband_date")
    public String disband_date;
	@JsonProperty("disband_condition")
    public String disband_condition;
	@JsonProperty("players_online")
    public int players_online;
	@JsonProperty("players_offline")
    public int players_offline;
	@JsonProperty("members_total")
    public int members_total;
	@JsonProperty("members_invited")
    public int members_invited;
	@JsonProperty("members")
    public ArrayList<Member> members;
	@JsonProperty("invites")
    public Object invites;
    
	public Guild() {
	}
    
	public Guild(String name, String world, String logo_url, String description, ArrayList<Guildhall> guildhalls,
			boolean active, String founded, boolean open_applications, String homepage, boolean in_war,
			String disband_date, String disband_condition, int players_online, int players_offline, int members_total,
			int members_invited, ArrayList<Member> members, Object invites) {
		this.name = name;
		this.world = world;
		this.logo_url = logo_url;
		this.description = description;
		this.guildhalls = guildhalls;
		this.active = active;
		this.founded = founded;
		this.open_applications = open_applications;
		this.homepage = homepage;
		this.in_war = in_war;
		this.disband_date = disband_date;
		this.disband_condition = disband_condition;
		this.players_online = players_online;
		this.players_offline = players_offline;
		this.members_total = members_total;
		this.members_invited = members_invited;
		this.members = members;
		this.invites = invites;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorld() {
		return world;
	}
	public void setWorld(String world) {
		this.world = world;
	}
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Guildhall> getGuildhalls() {
		return guildhalls;
	}
	public void setGuildhalls(ArrayList<Guildhall> guildhalls) {
		this.guildhalls = guildhalls;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getFounded() {
		return founded;
	}
	public void setFounded(String founded) {
		this.founded = founded;
	}
	public boolean isOpen_applications() {
		return open_applications;
	}
	public void setOpen_applications(boolean open_applications) {
		this.open_applications = open_applications;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public boolean isIn_war() {
		return in_war;
	}
	public void setIn_war(boolean in_war) {
		this.in_war = in_war;
	}
	public String getDisband_date() {
		return disband_date;
	}
	public void setDisband_date(String disband_date) {
		this.disband_date = disband_date;
	}
	public String getDisband_condition() {
		return disband_condition;
	}
	public void setDisband_condition(String disband_condition) {
		this.disband_condition = disband_condition;
	}
	public int getPlayers_online() {
		return players_online;
	}
	public void setPlayers_online(int players_online) {
		this.players_online = players_online;
	}
	public int getPlayers_offline() {
		return players_offline;
	}
	public void setPlayers_offline(int players_offline) {
		this.players_offline = players_offline;
	}
	public int getMembers_total() {
		return members_total;
	}
	public void setMembers_total(int members_total) {
		this.members_total = members_total;
	}
	public int getMembers_invited() {
		return members_invited;
	}
	public void setMembers_invited(int members_invited) {
		this.members_invited = members_invited;
	}
	public ArrayList<Member> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
	public Object getInvites() {
		return invites;
	}
	public void setInvites(Object invites) {
		this.invites = invites;
	}

	@Override
	public String toString() {
		return "Guild [name=" + name + ", world=" + world + ", logo_url=" + logo_url + ", description=" + description
				+ ", guildhalls=" + guildhalls + ", active=" + active + ", founded=" + founded + ", open_applications="
				+ open_applications + ", homepage=" + homepage + ", in_war=" + in_war + ", disband_date=" + disband_date
				+ ", disband_condition=" + disband_condition + ", players_online=" + players_online
				+ ", players_offline=" + players_offline + ", members_total=" + members_total + ", members_invited="
				+ members_invited + ", members=" + members + ", invites=" + invites + "]";
	}
	
    
    
}