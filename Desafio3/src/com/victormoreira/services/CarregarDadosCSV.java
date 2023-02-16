package com.victormoreira.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;

public class CarregarDadosCSV {
	private static String path = "arquivoUniversidade.csv";
	

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			Universidade universidade = new Universidade();
			line = br.readLine();

			while(line != null) {
				String[] lineFormatada = line.split(",", 0);
				universidade.processarCSV(lineFormatada);
				line = br.readLine();

			}
			System.out.println(universidade.getListaAlunos().get(0).getNotas().size());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
	
		}
	}		
}
