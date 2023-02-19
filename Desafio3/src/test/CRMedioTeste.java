package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import models.Curso;
import models.Universidade;
import services.CRMedioCurso;
import services.CarregarDadosCSV;
import services.Secretaria;

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
