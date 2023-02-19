package com.victormoreira.services;

import java.io.BufferedReader;
import java.io.FileReader;


import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;
/**
 * Classe Utilitária que lida com o carregamento 
 * do csv e em passar para a classe Universidade 
 * uma referencia da mesma classe carregada com os dados
 * */

public class CarregarDadosCSV {

private static String path = "arquivoUniversidade.csv"; //localização do arquivo csv
	
/**
 * Realiza a leitira do arquivo csv e o transfere para a classe universidade
 * @return universidade
 * */
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
	
}
