package com.victormoreira.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CRMedioCurso;
import com.victormoreira.services.CarregarDadosCSV;
import com.victormoreira.services.Secretaria;

public class CRMedioTeste {
	private Universidade universidade = CarregarDadosCSV.carregarDados();

	@Test
	public void deveriaRetornarCRMedio83paraCurso103() {
		Curso curso = Secretaria.getCursoPorCodigo("103", universidade);
		BigDecimal crMedio = CRMedioCurso.calcular(curso, universidade);	
		assertEquals(new BigDecimal("83.56"), crMedio);
		
	}
	@Test
	public void deveriaRetornarCRMedio21paraCurso78() {
		Curso curso = Secretaria.getCursoPorCodigo("21",universidade);
		BigDecimal crMedio = CRMedioCurso.calcular(curso, universidade);	
		assertEquals(new BigDecimal("75.30"), crMedio);
		
	}
}
