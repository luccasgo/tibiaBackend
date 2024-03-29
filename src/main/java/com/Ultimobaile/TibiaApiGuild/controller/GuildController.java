package com.Ultimobaile.TibiaApiGuild.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ultimobaile.TibiaApiGuild.ApiConsume;
import com.Ultimobaile.TibiaApiGuild.domains.Personagem;
import com.Ultimobaile.TibiaApiGuild.service.ScraperService;

@Controller
@RequestMapping("personagem")
public class GuildController {

	ApiConsume apiConsume = new ApiConsume();

	@CrossOrigin
	@PostMapping("/checar")
	public ResponseEntity<String> readBombas(@RequestBody Personagem personagem) throws ParseException, IOException {
		return ResponseEntity.ok(apiConsume.getChares(personagem.getNome()));
	}
	
}
