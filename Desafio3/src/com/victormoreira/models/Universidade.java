package com.victormoreira.models;


import java.util.ArrayList;
import java.util.List;

public class Universidade {
	private ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private ArrayList<Curso> cursosOferecidos = new ArrayList<Curso>();
	private ArrayList<String> listaMatriculados = new ArrayList<String>();
	private ArrayList<String> listaCursos = new ArrayList<String>();
	private int length = 0; 

	
	public Universidade() {
		
	}
	
	public void processarCSV(String[] lineFormatada) {
		criarListaAluno(lineFormatada);
		criarListaCurso(lineFormatada);
	}

	public void  criarListaAluno(String[] lineFormatada) {
		if(listaMatriculados.contains(lineFormatada[0])) {
			alunosMatriculados.get(alunosMatriculados.size()-1).addNota(lineFormatada[3]);	
			alunosMatriculados.get(alunosMatriculados.size()-1).addDisciplina(lineFormatada[1]);		

		}else {
			alunosMatriculados.add(new Aluno(lineFormatada[0], lineFormatada[1], lineFormatada[3]));
			listaMatriculados.add(lineFormatada[0]);

		}
	}
	public void  criarListaCurso(String[] lineFormatada) {
		if(listaCursos.contains(lineFormatada[2])) {
			length = cursosOferecidos.size() - 1;
			if(!cursosOferecidos.get(length).getMatriculasNoCurso().contains(lineFormatada[0])) {
				cursosOferecidos.get(length).addMatriculaNoCurso(lineFormatada[0]);
			};	

		}else {
			cursosOferecidos.add(new Curso(lineFormatada[0], lineFormatada[2], lineFormatada[4]));
			listaCursos.add(lineFormatada[2]);

		}
	}
	public List<Aluno> getListaAlunos() {
		return alunosMatriculados;
	}
	
	public List<Curso> getCursosOferecidos() {
		return this.cursosOferecidos;
	}
	
	
}
