package com.victormoreira.models;

import java.util.ArrayList;
import java.util.List;

public class Curso{
	private String curso;
	private ArrayList<String> disciplinasCurso = new ArrayList<String>();
	private ArrayList<String> cargaHoraria = new ArrayList<String>();
	
	public Curso() {
		
	}
	public Curso(String disciplina,String curso, String cargaHoraria ) {
		this.cargaHoraria.add(cargaHoraria);
		this.curso = curso;
		this.disciplinasCurso.add(disciplina);
	}
	
	
	
	public void addDisciplinasCurso(String disciplinaCod) {
		this.disciplinasCurso.add(disciplinaCod);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<String> getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria.add(cargaHoraria);
	}
	
	public List<String> getdisciplinasCurso(){
		return this.disciplinasCurso;
	}
	
}
