package com.victormoreira.services;

import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;

public class CRMedioCurso {

	private static Double somaNotas;

	public static double calcular(Curso curso) {
		/*Integer cargaHoraria = 0;
		Integer somaCr = 0;
		Integer somaCargaHoraria = 0;
		Integer notaAluno = 0;
		List<String> listaMatricula = new ArrayList<String>();
		String matriculaAtual;
		*/
		List<Double> crAluno = new ArrayList<Double>();

		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			Aluno aluno = curso.getAlunosCursantes().get(i);
			crAluno.add(CoeficienteRendimento.calcular(aluno));	
			
		}
		
		somaNotas = 0.0;
		for( Double notas : crAluno) {
			somaNotas += notas;
		}
		System.out.println(crAluno);
		return somaNotas / curso.getAlunosCursantes().size();
	}

}
