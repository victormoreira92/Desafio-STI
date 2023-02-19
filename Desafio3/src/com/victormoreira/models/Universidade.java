package com.victormoreira.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.victormoreira.services.CarregarDadosCSV;

public class Universidade{
	private  ArrayList<Aluno> alunosMatriculados;
	private  ArrayList<Curso> cursosOferecidos;
	private String path = "arquivoUniversidade.csv";

	public Universidade() {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			Map<String, String> mapaDeDadosDoCSV = CarregarDadosCSV.criarHashMapComCabecalhoDeCSV(line);
			line = br.readLine();
			
			while(line != null) {
				mapaDeDadosDoCSV =  CarregarDadosCSV.carregarDadosCSVparaMapa(line, mapaDeDadosDoCSV);
				this.matricularAlunos(mapaDeDadosDoCSV);
				this.cadastrarCursos(mapaDeDadosDoCSV);
				line = br.readLine();
			
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
	
	public void cadastrarCursos(Map<String, String> mapaDeDadosDoCSV) {
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
	}


	
	
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
			Aluno aluno = new Aluno(mapaDeDadosDoCSV.get("MATRICULA"),mapaDeDadosDoCSV.get("CARGA_HORARIA"),mapaDeDadosDoCSV.get("NOTA"));
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

	
	

}
