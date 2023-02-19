package models;

import java.util.ArrayList;

/**
 * Representa a o curso com da universidade com os alunos do curso, 
 * a carga Horaria, disciplina do curso.
 * @author victormoreira.
 * */
public class Curso {
	private final String cod_Curso; // identificador unico, por conta disso foi colocado como final
	private ArrayList<Aluno> alunosCursantes = new ArrayList<Aluno>();
	private ArrayList<String> disciplina = new ArrayList<String>();
	private ArrayList<String> cargaHoraria = new ArrayList<String>() ;
	
	
	public Curso(String cod_Curso, String matricula, String disciplina, String cargaHoraria, String nota ) {
		this.cod_Curso = cod_Curso;
		this.alunosCursantes.add(new Aluno(matricula, disciplina, nota));
		this.disciplina.add(disciplina);
		this.cargaHoraria.add(cargaHoraria);
	}
	/**
	 * Adiciona nas listas de Carga Horaria e Disciplina seus respectivos carga horaria e cod de disciplina
	 * @param String disciplina, Strinf cargaHoraria
	 * 
	 * */
	public void addDisciplinaCargaHoraria(String disciplina, String cargaHoraria) {
			this.disciplina.add(disciplina);
			this.cargaHoraria.add(cargaHoraria);
	}
	
	
	/**
	 * Verfica se o aluno não foi adicinoadao anteriormente, cria o objeto aluno e adiciona nas listas de alunos cursantes
	 * */
	public void adicionarAlunosAlunosAoCurso(String matricula, String nota, String disciplina) {
		Integer index = null;
		for(int i = 0; i < this.alunosCursantes.size(); i++) {
			if(this.alunosCursantes.get(i).getMatricula().equals(matricula)) {
				index = i;		
			}
		}
		if(index != null){
			this.getAlunosCursantes().get(index).addDisciplina(disciplina);
			this.getAlunosCursantes().get(index).addNota(nota);
		}else {
			Aluno aluno = new Aluno(matricula, disciplina, nota);
			this.alunosCursantes.add(aluno);
		}

	}
	/**
	 * Getter para o codigo do curso
	 * @return String
	 * */		
	public String getCodCurso() {
		return cod_Curso;
	}
	/**
	 * Getter lista de Disciplina
	 * @return ArrayList<String>
	 * */		

	public ArrayList<String> getDisciplina() {
		return disciplina;
	}
	/**
	 * Getter lista de objetos do tipo Aluno
	 * @return ArrayList<Aluno>
	 * */		
	
	public ArrayList<Aluno> getAlunosCursantes() {
			return this.alunosCursantes;
	}
	/**
	 * Getter lista de Carga Horaria.
	 * @return ArrayList<String>
	 * */	
	
	public ArrayList<String> getCargaHoraria() {
		return cargaHoraria;
	}

		
}
