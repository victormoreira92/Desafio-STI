package com.victormoreira.models;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Universidade{
	private String curso;
	private ArrayList<String> matriculasCurso = new ArrayList<String>();
	private Integer cargaHoraria;
	
	public Curso() {
		
	}
	public Curso(String matricula,String curso, String cargaHoraria ) {
		this.cargaHoraria = Integer.parseInt(cargaHoraria);
		this.curso = curso;
		this.matriculasCurso.add(matricula);
	}
	
	
	
	public void addMatriculaNoCurso(String matricula) {
		this.matriculasCurso.add(matricula);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public List<String> getMatriculasNoCurso(){
		return this.matriculasCurso;
	}
	
}
