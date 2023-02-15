package com.victormoreira.models;


import java.util.List;

public class Universidade {
	private List<Aluno> alunosMatriculados;
	private List<Curso> cursosOferecidos;
	
	public Universidade() {
		
	}

	public List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public List<Curso> getCursosOferecidos() {
		return cursosOferecidos;
	}

	public void setCursosOferecidos(List<Curso> cursosOferecidos) {
		this.cursosOferecidos = cursosOferecidos;
	}

	
}
