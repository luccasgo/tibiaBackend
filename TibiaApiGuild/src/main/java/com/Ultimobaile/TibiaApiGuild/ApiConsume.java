package com.Ultimobaile.TibiaApiGuild;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Ultimobaile.TibiaApiGuild.services.GuildsService;

@Service
public class ApiConsume {

	String guilda = "United";
	String url = "https://api.tibiadata.com/v3/guild/" + guilda;
	GuildsService guildsService = new GuildsService();
	RestTemplate restTemplate = new RestTemplate();

	private List<JSONObject> getGuild() throws ParseException {

		String response = restTemplate.getForObject(url, String.class);
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(response);
		JSONObject guilds = (JSONObject) json.get("guilds");
		JSONObject guild = (JSONObject) guilds.get("guild");
		List<JSONObject> members = (List<JSONObject>) guild.get("members");
		List<JSONObject> ativos = new ArrayList<JSONObject>();
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).get("status").equals("online")) {
				ativos.add(members.get(i));
			}
		}
		return ativos;
	}
	
	private List<JSONObject> getGuildGenerica(String guilda) throws ParseException {
		String url = "https://api.tibiadata.com/v3/guild/" + guilda;
		String response = restTemplate.getForObject(url, String.class);
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(response);
		JSONObject guilds = (JSONObject) json.get("guilds");
		JSONObject guild = (JSONObject) guilds.get("guild");
		List<JSONObject> members = (List<JSONObject>) guild.get("members");
		List<JSONObject> ativos = new ArrayList<JSONObject>();
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).get("status").equals("online")) {
				ativos.add(members.get(i));
			}
		}
		return ativos;
	}

	public List<JSONObject> getBombas() throws ParseException, FileNotFoundException {
		List<JSONObject> ativos = getGuild();
		List<JSONObject> bombas = new ArrayList<JSONObject>();
		List<String> listaBombas = guildsService.readBombas();
		String nome;
		for (int i = 0; i < ativos.size(); i++) {
			nome = (String) ativos.get(i).get("name");
			if (listaBombas.contains(nome)) {
				bombas.add(ativos.get(i));
			}
		}
		return bombas;
	}

	public List<JSONObject> getMains() throws ParseException, FileNotFoundException {
		List<JSONObject> ativos = getGuild();
		List<JSONObject> mains = new ArrayList<JSONObject>();
		List<String> listaMains = guildsService.readMains();
		String nome;
		for (int i = 0; i < ativos.size(); i++) {
			nome = (String) ativos.get(i).get("name");
			if (listaMains.contains(nome)) {
				mains.add(ativos.get(i));
			}
		}
		return mains;
	}
	
	public List<JSONObject> getGenerico(String guilda) throws ParseException, FileNotFoundException {
		List<JSONObject> ativos = getGuildGenerica(guilda);
		return ativos;
	}
}
