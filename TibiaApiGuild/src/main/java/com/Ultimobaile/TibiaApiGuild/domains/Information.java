package com.Ultimobaile.TibiaApiGuild.domains;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Information {
	
	@JsonProperty("api_version")
	public int api_version;
	@JsonProperty("timestamp")
    public Date timestamp;
    
	
	public Information() {
		super();
	}
    
	public Information(int api_version, Date timestamp) {
		this.api_version = api_version;
		this.timestamp = timestamp;
	}
	
	public int getApi_version() {
		return api_version;
	}
	public void setApi_version(int api_version) {
		this.api_version = api_version;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
    
    
}
