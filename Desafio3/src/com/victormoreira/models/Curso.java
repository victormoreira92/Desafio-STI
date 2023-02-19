package com.victormoreira.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Curso {
	private final String cod_Curso;
	private HashMap<String, String> disciplinaCargaHoraria = new HashMap<String, String>();
	private ArrayList<Aluno> alunosCursantes = new ArrayList<Aluno>();
	private ArrayList<String> disciplina = new ArrayList<String>();
	private ArrayList<String> cargaHoraria = new ArrayList<String>() ;
	
	
	public Curso(String cod_Curso, String matricula, String disciplina, String cargaHoraria, String nota ) {
		this.cod_Curso = cod_Curso;
		this.alunosCursantes.add(new Aluno(matricula, disciplina, nota));
		this.disciplina .add(disciplina);
		this.cargaHoraria .add(cargaHoraria);
	}
	
	
	
	public Curso(Map<String, String> mapaDeDadosDoCSV) {
		this.cod_Curso = mapaDeDadosDoCSV.get("COD_CURSO");
		this.alunosCursantes.add(new Aluno(mapaDeDadosDoCSV.get("MATRICULA"), mapaDeDadosDoCSV.get("COD_DISCIPLINA"), mapaDeDadosDoCSV.get("NOTA")));
		this.disciplinaCargaHoraria.put(mapaDeDadosDoCSV.get("COD_DISCIPLINA"), mapaDeDadosDoCSV.get("CARGA_HORARIA"));
	}



	public void addDisciplinaCargaHoraria(String disciplina, String cargaHoraria) {
		if(!this.disciplinaCargaHoraria.containsKey(disciplina)) {
			this.disciplinaCargaHoraria.put(disciplina, cargaHoraria);
		};
	}
	public HashMap<String,String> getDisciplinasCurso(){
			return this.disciplinaCargaHoraria;
	}
	
	public String getCod_Curso() {
		return this.cod_Curso;
	}


	public ArrayList<Aluno> getAlunosCursantes() {
		return this.alunosCursantes;
	}

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
			
	public void addNotas(String[] lineFormatada) {
		
	}
	
	public String getCodCurso() {
		return cod_Curso;
	}

	public Aluno encontrarAlunoPorMatricula(String matricula) {

		try {
			for(Aluno aluno : this.alunosCursantes) {
				if(aluno.getMatricula().equals(matricula)) {
					return aluno;
				}
			}
		}catch (Exception e) {
			System.out.println("Erro: Matricula não encontrada");
		}
		return null;
	}
	
	public String encontrarCargaHorariaPorCodigoDisciplina(String Codigo) {
		try {
			for(Entry<String, String> disciplinaCarga : this.disciplinaCargaHoraria.entrySet()) {
				if(disciplinaCarga.getKey().equals(Codigo)) {
					return disciplinaCarga.getValue();
				}
			}
		}catch (Exception e) {
			System.out.println("Erro: Codigo não encontrado");
		}
		return "";
	}



	public void adicionarDisciplinaCargaHoraria(String cod, String carga) {
		if(!this.disciplinaCargaHoraria.containsKey(cod)) {
			this.disciplinaCargaHoraria.put(cod, carga);
		}
	}



	public HashMap<String, String> getDisciplinaCargaHoraria() {
		return disciplinaCargaHoraria;
	}



	public ArrayList<String> getDisciplina() {
		return disciplina;
	}



	public ArrayList<String> getCargaHoraria() {
		return cargaHoraria;
	}

		
}
