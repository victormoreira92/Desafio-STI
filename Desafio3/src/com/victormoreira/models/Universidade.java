package com.victormoreira.models;


import java.util.ArrayList;
import java.util.List;

public class Universidade {
	private ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private List<Curso> cursosOferecidos;
	private ArrayList<String> listaMatriculados = new ArrayList<String>();
	
	public Universidade() {
		
	}
	
	public void processarCSV(String[] lineFormatada) {
		if(listaMatriculados.contains(lineFormatada[0])) {
			alunosMatriculados.get(alunosMatriculados.size()-1).addNota(lineFormatada[3]);		
		}else {
			alunosMatriculados.add(new Aluno(lineFormatada[0], lineFormatada[2], lineFormatada[3]));
			listaMatriculados.add(lineFormatada[0]);

		}
		int length = this.alunosMatriculados.size()-1;

	}

	private boolean contemAluno(String matricula) {
		if(this.alunosMatriculados.isEmpty()) {
			return false;
		}else {
			int length = this.alunosMatriculados.size()-1;
			System.out.println(this.alunosMatriculados.get(length));
			return this.alunosMatriculados.get(length).getMatricula() == matricula;
		}
	}
	
	public List<Aluno> getListaAlunos() {
		return alunosMatriculados;
	}
	
	
}
