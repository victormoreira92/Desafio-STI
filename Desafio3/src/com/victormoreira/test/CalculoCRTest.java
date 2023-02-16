package com.victormoreira.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CarregarDadosCSV;
import com.victormoreira.services.CoeficienteRendimento;


public class CalculoCRTest {
		
	private Universidade universidade = CarregarDadosCSV.carregarDados();
	
	
	@Test
	public void deveriaAluno100TerCR63() {
		Aluno aluno = universidade.getAlunoPelaMatricula("100");
		double cr = CoeficienteRendimento.calcular(aluno);
		
	    assertEquals(63.0, cr, 0);
		
	}
	
	@Test
	public void deveriaErroQuandoAlunoNaoExiste() {
		Aluno aluno = universidade.getAlunoPelaMatricula("16");
		double cr = CoeficienteRendimento.calcular(aluno);
		
	    assertEquals(75.0, cr, 0);
		
	}
	
	@Test
	public void deveriaCRterValor59QuandoNoAluno116() {
		Aluno aluno = universidade.getAlunoPelaMatricula("116");
		double cr = CoeficienteRendimento.calcular(aluno);
		
	    assertEquals(59.0, cr, 0);
		
	}
	
	
}
