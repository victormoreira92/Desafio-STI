package com.victormoreira.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import com.victormoreira.models.Universidade;
import com.victormoreira.services.CarregarDadosCSV;

public class CalculoCRAplication {

	public static void main(String[] args) throws Exception {
		 Reader fr = new FileReader("arquivoUniversidade.csv");
         try (BufferedReader br = new BufferedReader(fr)) {
			System.out.println(br.readLine());
		}
	}

}
