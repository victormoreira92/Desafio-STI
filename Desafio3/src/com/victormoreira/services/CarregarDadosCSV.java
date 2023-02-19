package com.victormoreira.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;

public class CarregarDadosCSV {
	
private static String path = "arquivoUniversidade.csv";
	

	public static Universidade carregarDados() {
		Universidade universidade = new Universidade();

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			line = br.readLine();

			while(line != null) {
				String[] lineFormatada = line.split(",", 0);
				universidade.cadastrarDados(lineFormatada);
				line = br.readLine();

			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return universidade;
	}		
	public static Map<String, String> carregarDadosCSVparaMapa(String linha, Map<String, String> mapaCabecalhoCSV) {
		
		if(!linha.isBlank()) {
			String[] lineFormatada = linha.split(",", 0);
			mapaCabecalhoCSV.put("MATRICULA", lineFormatada[0]);
			mapaCabecalhoCSV.put("COD_DISCIPLINA", lineFormatada[1]);
			mapaCabecalhoCSV.put("COD_CURSO", lineFormatada[2]);
			mapaCabecalhoCSV.put("NOTA", lineFormatada[3]);
			mapaCabecalhoCSV.put("CARGA_HORARIA", lineFormatada[4]);
			mapaCabecalhoCSV.put("ANO_SEMESTRE", lineFormatada[5]);
			
			return mapaCabecalhoCSV;

		}else {
			return null;
		}
	}


	public  static Map<String, String> criarHashMapComCabecalhoDeCSV(String line) {
		String[] listaCabecalhos = line.split(",", 0);
		Map<String, String> cabecalhoCSV = new HashMap<String, String>();
		for(String titulo : listaCabecalhos) {
			cabecalhoCSV.put(titulo, "");
		}
		return cabecalhoCSV;
	}
	
	
}
