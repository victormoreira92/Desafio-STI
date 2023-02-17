package com.victormoreira.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Aluno {
	private String matricula;
	private ArrayList<Disciplina> disciplinasCursadas = new ArrayList<Disciplina>();
	private ArrayList<String> notasCursos = new ArrayList<String>();
	
	
	public Aluno(){
		
	}
	public Aluno(String matricula, String nota) {
		this.matricula = matricula;
		this.notasCursos.add(nota);
	}
	
	public Aluno(String matricula, Disciplina disciplina, String nota) {
		this.matricula = matricula;
		this.disciplinasCursadas.add(disciplina);
		this.notasCursos.add(nota);
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void addNota(String nota) {
		this.notasCursos.add(nota);
	}
	
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinasCursadas.add(disciplina);

	}

	public List<String> getNotas() {
		return this.notasCursos;
	}
	
	public List<Disciplina> getDisciplnasCursadas() {
		return this.disciplinasCursadas;
	}
	
}
