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
		int numeroAlunosMatriculados = universidade.getAlunosMatriculados().size();
		
		assertEquals(17, numeroAlunosMatriculados);
		
	}
	
	@Test
	public void numeroDeAlunosNoCurso21DeveriaSer17() {
		int numeroAlunosMatriculados = universidade.getAlunoNoCurso("21").size();
		
		assertEquals(16, numeroAlunosMatriculados);
		
	}
	@Test
	public void numeroDeDisciplinasNoCurso103DeveriaSer14() {
		int numeroDisciplinas = universidade.getDisciplinasDoCurso("103").size();
		
		assertEquals(14, numeroDisciplinas);
		
	}
	
	
	@Test
	public void curso21DeveRetornar11Aluno() {
		Curso curso = universidade.getCursoPorCodigo("21");
		int numeroAlunos = curso.getAlunosCursantes().size();
		
		assertEquals(16, numeroAlunos);
		
	}
	
	@Test
	public void curso21Retornar12Disciplinas() {
		Curso curso = universidade.getCursoPorCodigo("21");
		int numeroDisciplina = curso.getDisciplinasCurso().size();
		
		assertEquals(12, numeroDisciplina);
		
	}
	
}
