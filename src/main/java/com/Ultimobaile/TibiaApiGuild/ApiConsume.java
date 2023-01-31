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
		p.setNome(fixName(nome));
		Integer retorno = CharesDTO.filtrarPontuacao(p);
		return retorno.toString();

	}
	
	private String fixName(String nome) {
		String retorno = nome;
		String a = null;
		String b = "";
		String concatenar = "";
		retorno.toLowerCase();
		String[] lista = retorno.split(" ");
		for (int i = 0; i < lista.length; i++) {
			if(i>0) {
				concatenar+=" ";
			}
			a = lista[i];
			b = a.substring(0,1).toUpperCase() + a.substring(1);
			concatenar+=b;
			retorno = concatenar;
		}
		return retorno.trim();
	}
	
	private Character upperCaseChar(Character chara) {
		chara.toUpperCase(0);
		return chara;
	}


}
