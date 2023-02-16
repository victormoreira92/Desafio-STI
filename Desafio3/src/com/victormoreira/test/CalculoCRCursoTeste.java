package com.victormoreira.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CRMedioCurso;
import com.victormoreira.services.CarregarDadosCSV;

public class CalculoCRCursoTeste {
	private Universidade universidade = CarregarDadosCSV.carregarDados();

	@Test
	public double deveriaRetornarCRMedio68paraCurso4() {
		Curso curso = universidade.getCursoPorCodigo("4");
		double crMedio = CRMedioCurso.calcular(curso);
		
		assertEquals(68.0, crMedio);
		
	}
}
