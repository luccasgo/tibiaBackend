package com.Ultimobaile.TibiaApiGuild.dtos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.client.RestTemplate;

import com.Ultimobaile.TibiaApiGuild.domains.Personagem;
import com.Ultimobaile.TibiaApiGuild.service.ScraperService;

public class CharesDTO {

	static RestTemplate restTemplate = new RestTemplate();

	public static Integer filtrarPontuacao(Personagem personagem) throws ParseException, IOException {
//		pegarTibiaRing(personagem);
		String url = "https://dev.tibiadata.com/v3/character/" + personagem.getNome();
		String response = restTemplate.getForObject(url, String.class);
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(response);
		JSONObject characters = (JSONObject) json.get("characters");
		List<JSONObject> deaths = (List<JSONObject>) characters.get("deaths");
		List<JSONObject> killers = new ArrayList<>();
		if (deaths != null) {
			for (int i = 0; i < deaths.size(); i++) {

				killers = (List<JSONObject>) deaths.get(i).get("killers");
				if (killers.size() <= 2 && killers.size() != 1) {
					personagem.setPontuacao(personagem.getPontuacao() + 600);
				} else if (killers.size() <= 5) {
					personagem.setPontuacao(personagem.getPontuacao() + 300);
				} else if (killers.size() <= 10) {
					personagem.setPontuacao(personagem.getPontuacao() + 100);
				} else {
					personagem.setPontuacao(personagem.getPontuacao() + 50);
				}
			}
			ScraperService s = new ScraperService();
			String st = s.scrape(personagem.getNome());
			personagem.setPontuacao(personagem.getPontuacao() + Integer.parseInt(st));
		} else {
			personagem.setPontuacao(0);
		}

		return personagem.getPontuacao();
	}

}
