package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Aluno;
import models.Universidade;
import services.CarregarDadosCSV;
import services.CoeficienteRendimento;
import services.Secretaria;


public class CalculoCRTest {
		
	private Universidade universidade = CarregarDadosCSV.carregarDados();
	
	
	@Test
	public void deveriaAluno100TerCR63() {
		Aluno aluno = Secretaria.getAlunoPorMatricula("100", universidade);
		BigDecimal cr = CoeficienteRendimento.calcular(aluno, universidade);
		
	    assertEquals(new BigDecimal("63.33"), cr);
		
	}
	
	@Test
	public void deveriaRetornarNullQuandoAlunoNaoExiste() {
		Aluno aluno = Secretaria.getAlunoPorMatricula("16", universidade);
		
	    assertEquals(null, aluno );
		
	}
	
	@Test
	public void deveriaCRterValor59QuandoNoAluno116() {
		Aluno aluno = Secretaria.getAlunoPorMatricula("116", universidade);
		BigDecimal cr = CoeficienteRendimento.calcular(aluno, universidade);
		
	    assertEquals(new BigDecimal("59.81"), cr);
		
	}
	
	
}
