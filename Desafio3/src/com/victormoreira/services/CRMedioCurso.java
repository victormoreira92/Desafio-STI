package com.victormoreira.services;

import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;

public class CRMedioCurso {

	private static Integer somaNotas;

	public static double calcular(Curso curso) {
		Integer cargaHoraria = 0;
		List<Double> crAluno = new ArrayList<Double>();
		Integer somaCr = 0;
		Integer somaCargaHoraria = 0;
		Integer notaAluno = 0;
		List<String> listaMatricula = new ArrayList<String>();
		String matriculaAtual;
		
		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			Aluno aluno = curso.getAlunosCursantes().get(i);
			crAluno.add(CoeficienteRendimento.calcular(aluno));	
		}
		somaNotas = 1;
		return somaNotas /curso.getAlunosCursantes().size();
	}

}
