package com.victormoreira.models;


import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma universidade com a lista de aluno matriculado, disciplinas ofercidas e os cursos ofertados
 * @author Victor Moreira
 * 
 * */
public class Universidade{
	private  ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private  ArrayList<Disciplina> disciplinaOfercidas = new ArrayList<Disciplina>();
	private  ArrayList<Curso> cursosOferecidos = new ArrayList<Curso>();

	
	public Universidade() {

	}
	/**
	 * Cadastra os dados da lista de String nos atributos da classe
	 * @param String[]
	 * @return void
	 * */
	public void cadastrarDados(String[] dados) {
		this.cadastrarCursos(dados);
		this.matricularAlunos(dados);
		this.cadastrarDisciplinas(dados);
	}
	
	
	/**
	 * Cria um objeto do tipo Disciplina e adiciona na lista disciplinaOfercidas.
	 *  @param String[];
	 * @return void;
	 * */
	public void cadastrarDisciplinas(String[] lineFormatada) {
		Disciplina disciplina = new Disciplina(lineFormatada[1],lineFormatada[4],lineFormatada[1]);
		this.disciplinaOfercidas.add(disciplina);
	}
	
	
	/**
	 * Cria um objeto do tipo Aluno, verifica se no caso a matricula ja foi adicionada na lista 
	 * e cria o objeto Aluno e adiciona na lista alunosMatriculados. 
	 * @param String[]
	 * @return void
	 * */
	
	public void matricularAlunos(String[] lineFormatada) {
		Integer index = null;
		for(int i = 0; i < this.alunosMatriculados.size(); i++) {
			if(this.alunosMatriculados.get(i).getMatricula().equals(lineFormatada[0])) {
				index = i;
			};
		}
		if(index != null) {
			this.alunosMatriculados.get(index).addDisciplina(lineFormatada[1]);
			this.alunosMatriculados.get(index).addNota(lineFormatada[3]);
		}else {
			Aluno aluno = new Aluno(lineFormatada[0],lineFormatada[1],lineFormatada[3]);
			this.alunosMatriculados.add(aluno);
		}		
	}
	/**
	 * Verifica se existe o elemento na lista e cria um objeto do tipo Curso e
	 *  adiciona na lista cursosOfercidos 
	 * @param String[]
	 * @return void
	 * 
	 * */

	public  void cadastrarCursos(String[] lineFormatada) {
		Integer index = null;
		for(int i = 0; i < this.cursosOferecidos.size(); i++) {
			if(this.cursosOferecidos.get(i).getCodCurso().equals(lineFormatada[2])) {
				index = i;
			}
		}
		
		if(index != null) {
				this.cursosOferecidos.get(index).addDisciplinaCargaHoraria(lineFormatada[1], lineFormatada[4]);
				this.cursosOferecidos.get(index).adicionarAlunosAlunosAoCurso(lineFormatada[0],lineFormatada[3], lineFormatada[1]);
			}else {
				Curso curso = new Curso(lineFormatada[2], lineFormatada[0], lineFormatada[1], lineFormatada[4], lineFormatada[3]);
				this.cursosOferecidos.add(curso);
			}
		
	}
	
	/**
	 * Get Lista de Alunos Matriculados da universidade
	 * @return List<Aluno>
	 * */
	
	public  List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	/**
	 * Get Lista de Cursos Ofercidos da universidade
	 * @return List<Curso>
	 * */
	
	public  List<Curso> getCursosOferecidos() {
		return cursosOferecidos;
	}
	
	/**
	 * Get Lista de Disciplina da universidade
	 * @return List<Disciplina>
	 * */
	public  List<Disciplina> getDisciplinas() {
		return this.disciplinaOfercidas;
	}
	




	
	

}
