package com.Ultimobaile.TibiaApiGuild.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Member {

	@JsonProperty("name")
	public String name;
	@JsonProperty("title")
    public String title;
	@JsonProperty("rank")
    public String rank;
	@JsonProperty("vocation")
    public String vocation;
	@JsonProperty("level")
    public int level;
	@JsonProperty("joined")
    public String joined;
	@JsonProperty("status")
    public String status;
    
	public Member(String name, String title, String rank, String vocation, int level, String joined, String status) {
		this.name = name;
		this.title = title;
		this.rank = rank;
		this.vocation = vocation;
		this.level = level;
		this.joined = joined;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getVocation() {
		return vocation;
	}
	public void setVocation(String vocation) {
		this.vocation = vocation;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getJoined() {
		return joined;
	}
	public void setJoined(String joined) {
		this.joined = joined;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
