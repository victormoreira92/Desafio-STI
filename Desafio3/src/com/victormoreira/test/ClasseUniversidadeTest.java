package com.victormoreira.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CRMedioCurso;
import com.victormoreira.services.CarregarDadosCSV;
import com.victormoreira.services.Secretaria;

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
	public void numeroDeAlunosNoCurso21DeveriaSer16() {
		int numeroAlunosMatriculados = Secretaria.getCursoPorCodigo("21", universidade).getAlunosCursantes().size();
		assertEquals(16, numeroAlunosMatriculados);
		
	}
	@Test
	public void numeroDeDisciplinasNoCurso103DeveriaSer14() {
		int numeroDisciplinas = Secretaria.getDisciplinasDoCurso("103", universidade).size();
		assertEquals(14, numeroDisciplinas);
		
	}
	
	
	@Test
	public void curso103DeveRetornar9Aluno() {
		int curso = Secretaria.getAlunoNoCurso("103", universidade).size();
		assertEquals(9, curso);
		
	}
	
	@Test
	public void curso21Retornar99Disciplinas() {
		int numeroDisciplina = Secretaria.getCursoPorCodigo("21", universidade).getDisciplina().size();
		
		assertEquals(99, numeroDisciplina);
		
	}
	
}
