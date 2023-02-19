package services;

import java.util.ArrayList;
import java.util.List;

import models.Aluno;
import models.Curso;
import models.Universidade;
/**
 * Classe Utilitária que representa todas as atividade de uma secretaria, 
 * sendo uma comunicação entre as clase
 * */
public class Secretaria {
	/**
	 * Encontra a carga horaria de uma disiciplina pelo codigo
	 * 
	 * @param String codido, Universidade universidade
	 * @return String
	 * */
	public static String encontrarCargaHorariaPorDisciplina(String string,Universidade universidade) {
		String carga = null;
		for(int i=0; i < universidade.getDisciplinas().size(); i++) {
			if(universidade.getDisciplinas().get(i).getDisciplina().equals(string)) {
				carga = universidade.getDisciplinas().get(i).getCargaHoraria();
			}
		}
		return carga;
	}
	/**
	 * Encontra a listas de disciplinas de um curso utilizando o codigo do curso
	 * 
	 * @param String codido, Universidade universidade
	 * @return ArrayList<String>
	 * */
	public static ArrayList<String> getDisciplinasDoCurso(String string, Universidade universidade) {
		for(Curso curso : universidade.getCursosOferecidos() ) {
			if(curso.getCodCurso().equals(string)) {
				return curso.getDisciplina();
			}
		}
		return null;
	}
	/**
	 * Encontra a listas de alunos de um curso utilizando o codigo do curso
	 * 
	 * @param String codigo, Universidade universidade
	 * @return ArrayList<String>
	 * */
	public static List<Aluno> getAlunoNoCurso(String string, Universidade universidade) {
		for(Curso curso : universidade.getCursosOferecidos()) {
			if(curso.getCodCurso().equals(string)) {
				return curso.getAlunosCursantes();
			}
		}
		return null;
	}
	/**
	 * Encontra o objeto Aluno utilizando o codigo do matricula
	 * 
	 * @param String matricula, Universidade universidade
	 * @return Aluno
	 * */
	
	public static Aluno getAlunoPorMatricula(String string, Universidade universidade) {
		for(Aluno aluno : universidade.getAlunosMatriculados()) {
			if(aluno.getMatricula().equals(string)) {
				return aluno;
			}
		}
		return null;
	}
	
	/**
	 * Encontra o objeto Curso utilizando o codigo do curso
	 * 
	 * @param String codCurso, Universidade universidade
	 * @return Curso
	 * */
	
	public static Curso getCursoPorCodigo(String string, Universidade universidade) {
		for(Curso curso : universidade.getCursosOferecidos()) {
			if(curso.getCodCurso().equals(string)) {
				return curso;
			}
		}
		return null;
	}
	
	

}
