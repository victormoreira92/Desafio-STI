package com.victormoreira.services;

import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;

public class CRMedioCurso {

	public static double calcular(Curso curso) {
		double crAlunos = 0;
		List<Aluno> alunosCurso = curso.getAlunosCursantes();
		for(Aluno aluno: alunosCurso) {
			crAlunos = CoeficienteRendimento.calcular(aluno);
		}
		return crAlunos / curso.getAlunosCursantes().size() ;
	}

}
