package com.Ultimobaile.TibiaApiGuild;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.Ultimobaile.TibiaApiGuild.domains.Personagem;
import com.Ultimobaile.TibiaApiGuild.dtos.CharesDTO;

@Service
public class ApiConsume {

	public String getChares(Personagem personagem) throws ParseException, IOException {
		
		Integer retorno = CharesDTO.filtrarPontuacao(personagem);
		return retorno.toString();

	}
	
	
}
