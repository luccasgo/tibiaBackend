package com.Ultimobaile.TibiaApiGuild.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ultimobaile.TibiaApiGuild.ApiConsume;
import com.Ultimobaile.TibiaApiGuild.domains.Personagem;

@Controller
@RequestMapping("personagem")
public class GuildController {

	ApiConsume apiConsume = new ApiConsume();

	@GetMapping("/checar")
	@CrossOrigin
	public ResponseEntity<String> readBombas(@PathVariable Personagem personagem) throws ParseException, IOException {
		return ResponseEntity.ok(apiConsume.getChares(personagem));
	}


}
