package com.victormoreira.application;

import com.victormoreira.models.Universidade;
import com.victormoreira.services.CarregarDadosCSV;

public class CalculoCRAplication {
	private static Universidade universidade = new Universidade();

	public static void main(String[] args) throws Exception {
		universidade = CarregarDadosCSV.carregarDados();
	}

}
