package com.victormoreira.models;


public class Disciplina {
	private String disciplina;
	private String cargaHoraria;
	
	public Disciplina(String disciplina, String cargaHoraria){
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
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
