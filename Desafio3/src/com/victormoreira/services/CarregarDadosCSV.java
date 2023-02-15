package com.victormoreira.services;

import java.io.BufferedReader;
import java.io.FileReader;

public class CarregarDadosCSV {
	private static String path = "arquivoUniversidade.csv";

	public static void criarDadosUniversidade() throws Exception {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			int dados = 0;
			while(line != null) {
				dados++;
				line = br.readLine();
			}
			System.out.println("Foram lidas "+dados+" linhas do arquivo");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
	
		}
	}
		
}
