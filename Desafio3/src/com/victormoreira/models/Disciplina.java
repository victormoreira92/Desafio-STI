package com.victormoreira.models;

import java.util.Map;

public class Disciplina extends Universidade{
	private String disciplina;
	private String cargaHoraria;
	private final String curso;
	
	public Disciplina(String disciplina, String cargaHoraria, String curso){
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
}
