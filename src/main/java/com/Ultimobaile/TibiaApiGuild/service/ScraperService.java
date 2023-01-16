package com.Ultimobaile.TibiaApiGuild.service;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class ScraperService {

	public String scrape(String nome) throws IOException {
		nome.toLowerCase();
		String[] listaNome = nome.split(" ");
		StringBuilder sb = new StringBuilder();
		String urlBase = "https://www.tibiaring.com/char.php?c=";
		sb.append(urlBase);
		for (int i = 0; i < listaNome.length; i++) {
			sb.append(listaNome[i]);
			if (i != listaNome.length - 1) {
				sb.append("+");
			}
		}
		sb.append("&lang=pt");
		String url = sb.toString();
		String retorno = "";
		Document doc = Jsoup.connect(url).get();


		Elements elements = doc.select("tr td.CSC:nth-child(2)");
		for (Element element : elements) {
			if (element.text().equals(nome)) {
				Element next = element.nextElementSibling();
				while (next != null && !next.hasClass("alr")) {
					next = next.nextElementSibling();
				}
				String ponto = next.toString();
				Pattern pattern = Pattern.compile(">(.*?)<");
		        Matcher matcher = pattern.matcher(ponto);
		        String value = matcher.group(1);

				retorno = value;
				break;
			}
		}
		return retorno;
	}
}