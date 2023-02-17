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
	public void numeroDeCursosNaUniversidadeDeveSer5() {
		int numeroDisciplinas = universidade.getCursosOferecidos().size();
		
		assertEquals(5, numeroDisciplinas);
		
	}
	
	@Test
	public void numeroDeAlunosDaUniversidadeDeveriaSer17() {
		int numeroAlunosMatriculados = universidade.getListaAlunos().size();
		
		assertEquals(17, numeroAlunosMatriculados);
		
	}
	
	@Test
	public void numeroDeDisciplinasNoCurso4DeveriaSer86() {
		int numeroDisciplinas = universidade.getCursoPorCodigo("4").getDisciplinasCurso().size();
		
		assertEquals(86, numeroDisciplinas);
		
	}
	
	
	@Test
	public void curso21DeveRetornar11Aluno() {
		Curso curso = universidade.getCursoPorCodigo("21");
		int numeroAlunos = curso.getAlunosCursantes().size();
		
		assertEquals(11, numeroAlunos);
		
	}
	
	@Test
	public void curso21Retornar12Disciplinas() {
		Curso curso = universidade.getCursoPorCodigo("21");
		int numeroDisciplina = curso.getDisciplinasCurso().size();
		
		assertEquals(12, numeroDisciplina);
		
	}
	
}
