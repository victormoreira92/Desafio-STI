package com.victormoreira.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CRMedioCurso;
import com.victormoreira.services.CarregarDadosCSV;

public class ClasseUniversidadeTest {
	
	private Universidade universidade = CarregarDadosCSV.carregarDados();

	@Test
	public void curso21DeveRetornar11Aluno() {
		Curso curso = universidade.getCursoPorCodigo("21");
		int numeroAlunos = curso.getAlunosCursantes().size();
		
		assertEquals(11, numeroAlunos);
		
	}
	
}
