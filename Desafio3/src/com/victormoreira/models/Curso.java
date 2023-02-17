package com.victormoreira.models;

import java.util.ArrayList;
import java.util.List;

public class Curso{
	private String curso;
	private ArrayList<Disciplina> disciplinasCurso = new ArrayList<Disciplina>();
	private ArrayList<Aluno> alunosCursantes = new ArrayList<Aluno>();
	
	public Curso() {
		
	}
	public Curso(String [] linha) {
		this.alunosCursantes.add(new Aluno(linha[0], Integer.parseInt(linha[3])));
		this.curso = linha[2];
		this.disciplinasCurso.add(new Disciplina(linha[1], linha[4]));
	}
	
	
	
	public void addDisciplinasCurso(String[] linha) {
		this.disciplinasCurso.add(new Disciplina(linha[1], linha[4]));
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Aluno> getAlunosCursantes() {
		return this.alunosCursantes;
	}

	public void addAlunosCursantes(String[] linha) {
		this.alunosCursantes.add(new Aluno(linha[0], Integer.parseInt(linha[3])));
	}
	
	public List<Disciplina> getDisciplinasCurso(){
		return this.disciplinasCurso;
	}
	
}
