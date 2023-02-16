package com.victormoreira.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CoeficienteRendimento;

public class CalculoCRTest {
	
	@Test
	public void deveriaAluno100TerCR7() {
		Universidade universidade = new Universidade();
		Aluno aluno = universidade.getAlunoPelaMatricula("100");
		double cr = CoeficienteRendimento.calcular(aluno);
		
	    assertEquals("Valor de CR incorreto.", 7.5, cr, 0);
		
	}
}
