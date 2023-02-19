package models;

import java.util.Map;
/**
 * Representa as disciplinas da universidade com seu nome, carga Horaria, e curso que pertence
 * @author victormoreira
 * */
public class Disciplina extends Universidade{
	private String disciplina;
	private String cargaHoraria;
	private final String curso;
	
	public Disciplina(String disciplina, String cargaHoraria, String curso){
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
		this.curso = curso;
	}
	/**
	 * Getter que disciplina pertence Curso
	 * @return String
	 * */	
	public String getCurso() {
		return curso;
	}
	/**
	 * Getter para o codigo da disciplina
	 * @return String
	 * */	
	public String getDisciplina() {
		return disciplina;
	}
	
	/**
	 * Getter que carga horaria da disciplina
	 * @return String
	 * */	
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}

	
	
	
}
