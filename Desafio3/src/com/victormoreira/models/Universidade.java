package com.victormoreira.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.victormoreira.services.CarregarDadosCSV;

public class Universidade{
	private  ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private  ArrayList<Curso> cursosOferecidos = new ArrayList<Curso>();
	private  String path = "arquivoUniversidade.csv";

	public Universidade() {

	}
	public void cadastrarDados(String[] dados) {
		this.cadastrarCursos(dados);
		this.matricularAlunos(dados);
	}
	
	private void matricularAlunos(String[] lineFormatada) {
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
			Aluno aluno = new Aluno(lineFormatada[0],lineFormatada[2],lineFormatada[3]);
			this.alunosMatriculados.add(aluno);
		}		
	}

	private void cadastrarCursos(String[] lineFormatada) {
		Integer index = null;
		for(int i = 0; i < this.cursosOferecidos.size(); i++) {
			if(this.cursosOferecidos.get(i).getCod_Curso().equals(lineFormatada[2])) {
				index = i;
			}
		}
		
		if(index != null) {
				this.cursosOferecidos.get(index).adicionarDisciplinaCargaHoraria(lineFormatada[1], lineFormatada[4]);
				this.cursosOferecidos.get(index).adicionarAlunosAlunosAoCurso(lineFormatada[0], lineFormatada[1], lineFormatada[3]);
			}else {
				Curso curso = new Curso(lineFormatada[2], lineFormatada[0], lineFormatada[1], lineFormatada[4], lineFormatada[3]);
				this.cursosOferecidos.add(curso);
			}
		
	}

	/*public void cadastrarCursos(Map<String, String> mapaDeDadosDoCSV) {
		Integer index = null;
		for(int i = 0; i < this.cursosOferecidos.size(); i++) {
			if(this.cursosOferecidos.get(i).getCod_Curso().equals(mapaDeDadosDoCSV.get("COD_CURSO"))) {
				index = i;
			};
		}
		if(index != null) {
			this.cursosOferecidos.get(index).adicionarDisciplinaCargaHoraria(mapaDeDadosDoCSV);
			this.cursosOferecidos.get(index).adicionarAlunosAlunosAoCurso(mapaDeDadosDoCSV.get("MATRICULA"), mapaDeDadosDoCSV.get("NOTA"),mapaDeDadosDoCSV.get("COD_DISCIPLINA"));
		}else {
			Curso curso = new Curso(mapaDeDadosDoCSV);
			this.cursosOferecidos.add(curso);
		}
	}*/


	
	
	public void  matricularAlunos(Map<String, String> mapaDeDadosDoCSV) {	
		Integer index = null;
		for(int i = 0; i < this.alunosMatriculados.size(); i++) {
			if(this.alunosMatriculados.get(i).getMatricula().equals(mapaDeDadosDoCSV.get("MATRICULA"))) {
				index = i;
			};
		}
		if(index != null) {
			this.alunosMatriculados.get(index).addDisciplina(mapaDeDadosDoCSV.get("COD_DISCIPLINA"));
			this.alunosMatriculados.get(index).addNota(mapaDeDadosDoCSV.get("NOTA"));
		}else {
			Aluno aluno = new Aluno(mapaDeDadosDoCSV.get("MATRICULA"),mapaDeDadosDoCSV.get("COD_DISCIPLINA"),mapaDeDadosDoCSV.get("NOTA"));
			this.alunosMatriculados.add(aluno);
		}
	}
	

	public  List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	
	public  List<Curso> getCursosOferecidos() {
		return cursosOferecidos;
	}
	
	public String encontrarCargaHoraria(String string) {
		String carga = null;
		for(int i=0; i < this.getCursosOferecidos().size(); i++) {
			carga = this.cursosOferecidos.get(i).encontrarCargaHorariaPorCodigoDisciplina(string);
		}
		return carga;
	}
	public ArrayList<String> getDisciplinasDoCurso(String string) {
		for(Curso curso : this.cursosOferecidos) {
			if(curso.getCod_Curso().equals(string)) {
				return curso.getDisciplina();
			}
		}
		return null;
	}
	
	public List<Aluno> getAlunoNoCurso(String string) {
		for(Curso curso : this.cursosOferecidos) {
			if(curso.getCod_Curso().equals(string)) {
				return curso.getAlunosCursantes();
			}
		}
		return null;
	}



	
	

}
