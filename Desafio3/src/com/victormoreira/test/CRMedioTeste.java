package com.victormoreira.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CRMedioCurso;
import com.victormoreira.services.CarregarDadosCSV;

public class CRMedioTeste {
	private Universidade universidade = CarregarDadosCSV.carregarDados();

	@Test
	public void deveriaRetornarCRMedio53paraCurso103() {
		Curso curso = universidade.getCursoPorCodigo("103");
		double crMedio = CRMedioCurso.calcular(curso);
		
		assertEquals(53.7, crMedio);
		
	}
}
