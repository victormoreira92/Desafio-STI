package com.victormoreira.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Aluno extends Universidade {
	private final String matricula;
	private ArrayList<String> disciplinasCursadas = new ArrayList<String>();
	private ArrayList<String> notasCursos = new ArrayList<String>();
	
	
	public Aluno(String matricula, String codDisciplina, String nota) {
		this.matricula = matricula;
		this.disciplinasCursadas.add(codDisciplina);
		this.notasCursos.add(nota);
	}
	
	
	public void addNota(String nota) {
		this.notasCursos.add(nota);
	}
	
	public void addDisciplina(String disciplina) {
		this.disciplinasCursadas.add(disciplina);

	}

	public ArrayList<String> getNotasDoAluno() {
		return this.notasCursos;		

	}
	
	public ArrayList<String> getDisciplnasCursadas() {
		return this.disciplinasCursadas;
	}
	
	
	public String getMatricula() {
		return this.matricula;
	}
	
}
