package com.victormoreira.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/**
 * Representa um aluno da universidade, com as disciplinas cursadas e suas notas
 * @author Victor Moreira
 * */
public class Aluno extends Universidade {
	private final String matricula; //como identificador unico o acesso do atributo é final
	private ArrayList<String> disciplinasCursadas = new ArrayList<String>();
	private ArrayList<String> notasCursos = new ArrayList<String>();
	
	
	public Aluno(String matricula, String codDisciplina, String nota) {
		this.matricula = matricula;
		this.disciplinasCursadas.add(codDisciplina);
		this.notasCursos.add(nota);
	}
	
	/**
	 * Adicina notas do a lista de notas do aluno
	 * @param String
	 * 
	 * */
	public void addNota(String nota) {
		this.notasCursos.add(nota);
	}
	
	/**
	 * Adicina disciplina do a lista de disciplina do aluno
	 * @param String
	 * 
	 * */
	public void addDisciplina(String disciplina) {
		this.disciplinasCursadas.add(disciplina);

	}
	
	/**
	 * Getter para as notas do aluno
	 * @return ArrayList<String> 
	 * 
	 * */
	public ArrayList<String> getNotasDoAluno() {
		return this.notasCursos;		

	}
	/**
	 * Getter para as disciplinas cursadas do aluno
	 * @return ArrayList<String> 
	 * 
	 * */
	
	public ArrayList<String> getDisciplnasCursadas() {
		return this.disciplinasCursadas;
	}
	
	/**
	 * Getter para do matricula do aluno
	 * @return ArrayList<String> 
	 * 
	 * */
	
	public String getMatricula() {
		return this.matricula;
	}
	
}
