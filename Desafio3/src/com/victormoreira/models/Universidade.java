package com.victormoreira.models;


import java.util.ArrayList;
import java.util.List;


public class Universidade{
	private  ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private  ArrayList<Disciplina> disciplinaOfercidas = new ArrayList<Disciplina>();
	private  ArrayList<Curso> cursosOferecidos = new ArrayList<Curso>();

	public Universidade() {

	}
	public void cadastrarDados(String[] dados) {
		this.cadastrarCursos(dados);
		this.matricularAlunos(dados);
		this.cadastrarDisciplinas(dados);
	}
	
	public void cadastrarDisciplinas(String[] lineFormatada) {
		Disciplina disciplina = new Disciplina(lineFormatada[1],lineFormatada[4],lineFormatada[1]);
		this.disciplinaOfercidas.add(disciplina);
	}
	
	public void matricularAlunos(String[] lineFormatada) {
		Integer index = null;
		for(int i = 0; i < this.alunosMatriculados.size(); i++) {
			if(this.alunosMatriculados.get(i).getMatricula().equals(lineFormatada[0])) {
				index = i;
			};
		}
		if(index != null) {
			this.alunosMatriculados.get(index).addDisciplina(lineFormatada[1]);
			this.alunosMatriculados.get(index).addNota(lineFormatada[3]);
		}else {
			Aluno aluno = new Aluno(lineFormatada[0],lineFormatada[1],lineFormatada[3]);
			this.alunosMatriculados.add(aluno);
		}		
	}

	public  void cadastrarCursos(String[] lineFormatada) {
		Integer index = null;
		for(int i = 0; i < this.cursosOferecidos.size(); i++) {
			if(this.cursosOferecidos.get(i).getCod_Curso().equals(lineFormatada[2])) {
				index = i;
			}
		}
		
		if(index != null) {
				this.cursosOferecidos.get(index).addDisciplinaCargaHoraria(lineFormatada[1], lineFormatada[4]);
				this.cursosOferecidos.get(index).adicionarAlunosAlunosAoCurso(lineFormatada[0],lineFormatada[3], lineFormatada[1]);
			}else {
				Curso curso = new Curso(lineFormatada[2], lineFormatada[0], lineFormatada[1], lineFormatada[4], lineFormatada[3]);
				this.cursosOferecidos.add(curso);
			}
		
	}

	public  List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	
	public  List<Curso> getCursosOferecidos() {
		return cursosOferecidos;
	}
	
	public  List<Disciplina> getDisciplinas() {
		return this.disciplinaOfercidas;
	}
	




	
	

}
