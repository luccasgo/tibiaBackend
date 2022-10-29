package com.Ultimobaile.TibiaApiGuild.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ultimobaile.TibiaApiGuild.ApiConsume;

@Controller
@RequestMapping ("guild")
public class GuildController {
	
	ApiConsume apiConsume = new ApiConsume();
	
	@GetMapping("/bombas")
	public ResponseEntity<Object> readBombas() throws ParseException, IOException {
		return ResponseEntity.ok(apiConsume.getBombas());
	}
	
	@GetMapping("/mains")
	public ResponseEntity<Object> readMains() throws ParseException, FileNotFoundException {
		return ResponseEntity.ok(apiConsume.getMains());
	}
	
	@GetMapping("/generico/{guilda}")
	public ResponseEntity<Object> readGenerico(String guilda) throws ParseException, FileNotFoundException {
		return ResponseEntity.ok(apiConsume.getGenerico(guilda));
	}
	
}
