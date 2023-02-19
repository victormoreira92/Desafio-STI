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
