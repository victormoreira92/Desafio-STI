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
	public void deveriaRetornarCRMedio83paraCurso103() {
		Curso curso = universidade.getCursoPorCodigo("103");
		Double crMedio = CRMedioCurso.calcular(curso);
		
		assertEquals(83.5, crMedio);
		
	}
}
