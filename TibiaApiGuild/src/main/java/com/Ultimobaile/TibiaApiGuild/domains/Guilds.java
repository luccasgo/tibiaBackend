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
public class Guilds {
	@JsonProperty("guild")
	public Guild guild;

	public Guilds() {
		super();
	}
	
	public Guilds(Guild guild) {
		this.guild = guild;
	}

	public Guild getGuild() {
		return guild;
	}

	public void setGuild(Guild guild) {
		this.guild = guild;
	}
	
	

}
