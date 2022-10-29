package com.Ultimobaile.TibiaApiGuild.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class GuildsService {

	public List<String> readBombas() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:\\Users\\lucca\\Desktop\\UNITEDBOMBAS.TXT"));
		List<String> listaBombas = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			listaBombas.add(scanner.nextLine());
		}
		Collections.sort(listaBombas);
		return listaBombas;
	}
	public List<String> readMains() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:\\Users\\lucca\\Desktop\\UNITEDMAINS.TXT"));
		List<String> listaMains = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			listaMains.add(scanner.nextLine());
		}
		Collections.sort(listaMains);
		return listaMains;
	}
}
