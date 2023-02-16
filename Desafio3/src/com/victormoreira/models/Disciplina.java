package com.victormoreira.models;


public class Disciplina {
	private String disciplina;
	private String cargaHoraria;
	private String curso;
	
	public Disciplina(String disciplina, String cargaHoraria, String curso){
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
		this.curso = curso;
	}
	public Disciplina(String disciplina, String cargaHoraria) {
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
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
