package com.victormoreira.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Aluno {
	private String matricula;
	private ArrayList<String> disciplinasCursadas = new ArrayList<String>();
	private ArrayList<Integer> notasCursos = new ArrayList<Integer>();
	
	
	public Aluno(){
		
	}
	
	public Aluno(String matricula,String curso, String nota) {
		this.matricula = matricula;
		this.disciplinasCursadas.add(curso);
		this.notasCursos.add(Integer.parseInt(nota));
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void addNota(String nota) {
		this.notasCursos.add(Integer.parseInt(nota));
	}
	
	public void addDisciplina(String curso) {
		this.disciplinasCursadas.add(curso);

	}

	public List<Integer> getNotas() {
		return this.notasCursos;
	}
	
	public List<String> getCursos() {
		return this.disciplinasCursadas;
	}
	
}
