package com.victormoreira.services;

import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;

public class Secretaria {
	
	public static String encontrarCargaHorariaPorDisciplina(String string,Universidade universidade) {
		String carga = null;
		for(int i=0; i < universidade.getDisciplinas().size(); i++) {
			if(universidade.getDisciplinas().get(i).getDisciplina().equals(string)) {
				carga = universidade.getDisciplinas().get(i).getCargaHoraria();
			}
		}
		return carga;
	}
	
	public static ArrayList<String> getDisciplinasDoCurso(String string, Universidade universidade) {
		for(Curso curso : universidade.getCursosOferecidos() ) {
			if(curso.getCod_Curso().equals(string)) {
				return curso.getDisciplina();
			}
		}
		return null;
	}
	
	public static List<Aluno> getAlunoNoCurso(String string, Universidade universidade) {
		for(Curso curso : universidade.getCursosOferecidos()) {
			if(curso.getCod_Curso().equals(string)) {
				return curso.getAlunosCursantes();
			}
		}
		return null;
	}
	
	public static Aluno getAlunoPorMatricula(String string, Universidade universidade) {
		for(Aluno aluno : universidade.getAlunosMatriculados()) {
			if(aluno.getMatricula().equals(string)) {
				return aluno;
			}
		}
		return null;
	}
	public static Curso getCursoPorCodigo(String string, Universidade universidade) {
		for(Curso curso : universidade.getCursosOferecidos()) {
			if(curso.getCod_Curso().equals(string)) {
				return curso;
			}
		}
		return null;
	}
	
	

}
