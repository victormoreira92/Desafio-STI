package com.victormoreira.models;


import java.util.ArrayList;
import java.util.List;

public class Universidade {
	private ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private ArrayList<Curso> cursosOferecidos = new ArrayList<Curso>();
	private ArrayList<String> listaMatriculados = new ArrayList<String>();
	private ArrayList<Disciplina> disciplinaOferecidas = new ArrayList<Disciplina>();
	private int length = 0; 

	
	public Universidade() {
		
	}
	
	public void processarCSV(String[] lineFormatada) {
		criarListaAluno(lineFormatada);
		criarListaCurso(lineFormatada);
	}

	public void  criarListaAluno(String[] lineFormatada) {
		if(listaMatriculados.contains(lineFormatada[0])) {
			alunosMatriculados.get(alunosMatriculados.size()-1).addNota(lineFormatada[3]);	
			alunosMatriculados.get(alunosMatriculados.size()-1)
			.addDisciplina(new Disciplina(lineFormatada[1], lineFormatada[4],lineFormatada[2]));		

		}else {
			alunosMatriculados.add(new Aluno(lineFormatada[0],new Disciplina(lineFormatada[1], lineFormatada[4],lineFormatada[2]), lineFormatada[3]));
			listaMatriculados.add(lineFormatada[0]);

		}
	}
	public void  criarListaCurso(String[] lineFormatada) {
		Curso member = null;
		for(Curso curso : cursosOferecidos) {
			if(curso.getCurso().equals(lineFormatada[2])) {
				member = curso;
			}
		}
		if(member != null) {
			cursosOferecidos.get(cursosOferecidos.indexOf(member)).addAlunosCursantes(lineFormatada);;
			cursosOferecidos.get(cursosOferecidos.indexOf(member)).addDisciplinasCurso(lineFormatada);;

		}else {
			cursosOferecidos.add(new Curso(lineFormatada));
		}
	}
	
	public void criarListaDisciplina(String[] lineFormatada) {
		Disciplina member = null;
		for(Disciplina disciplina : disciplinaOferecidas) {
			if(disciplina.getDisciplina().equals(lineFormatada[1])) {
				member = disciplina;
			}
		}
		if(member != null) {
			disciplinaOferecidas.get(disciplinaOferecidas.indexOf(member)).setDisciplina(lineFormatada[1]);
			disciplinaOferecidas.get(disciplinaOferecidas.indexOf(member)).setCargaHoraria(lineFormatada[4]);
			disciplinaOferecidas.get(disciplinaOferecidas.indexOf(member)).setCargaHoraria(lineFormatada[2]);
			
		}else {
			disciplinaOferecidas.add(new Disciplina(lineFormatada[1],lineFormatada[4],lineFormatada[2]));
		}
	}
	public List<Aluno> getListaAlunos() {
		return alunosMatriculados;
	}
	
	public List<Curso> getCursosOferecidos() {
		return this.cursosOferecidos;
	}
	
	public List<Disciplina> getDisciplinas() {
		return this.disciplinaOferecidas;
	}
	
	public Aluno getAlunoPelaMatricula(String matricula) {
		for(Aluno aluno : alunosMatriculados) {
			if(aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		return null;
	}

	public Curso getCursoPorCodigo(String codigo) {
		for(Curso curso : cursosOferecidos) {
			if(curso.getCurso().equals(codigo)) {
				return curso;
			}
		}
		return null;
	}
	
	
}
