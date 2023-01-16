package com.Ultimobaile.TibiaApiGuild;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.Ultimobaile.TibiaApiGuild.domains.Personagem;
import com.Ultimobaile.TibiaApiGuild.dtos.CharesDTO;

@Service
public class ApiConsume {

	public String getChares(String nome) throws ParseException, IOException {
		Personagem p = new Personagem();
		p.setNome(nome);
		Integer retorno = CharesDTO.filtrarPontuacao(p);
		return retorno.toString();

	}


}
