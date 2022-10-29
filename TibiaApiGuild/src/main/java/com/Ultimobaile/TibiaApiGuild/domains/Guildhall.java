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
public class Guildhall {

	@JsonProperty("name")
	public String name;
	@JsonProperty("world")
    public String world;
	@JsonProperty("paid_until")
    public String paid_until;
    
	public Guildhall(String name, String world, String paid_until) {
		this.name = name;
		this.world = world;
		this.paid_until = paid_until;
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
	public String getPaid_until() {
		return paid_until;
	}
	public void setPaid_until(String paid_until) {
		this.paid_until = paid_until;
	}
    
    
	
}
