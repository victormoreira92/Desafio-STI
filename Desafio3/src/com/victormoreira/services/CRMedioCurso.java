package com.victormoreira.services;

import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;

public class CRMedioCurso {

	private static Integer somaNotas;

	public static double calcular(Curso curso) {
		Integer cargaHoraria = 0;
		List<Integer> crAluno = new ArrayList<Integer>();
		Integer somaCr = 0;
		Integer somaCargaHoraria = 0;
		Integer notaAluno = 0;
		List<String> listaMatricula = new ArrayList<String>();
		String matriculaAtual;
		
		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			
			matriculaAtual = curso.getAlunosCursantes().get(i).getMatricula();
			cargaHoraria = Integer.parseInt(curso.getDisciplinasCurso().get(i).getCargaHoraria());
			notaAluno = curso.getAlunosCursantes().get(i).getNotas().get(0);

			if(!listaMatricula.contains(matriculaAtual)) {
				somaCr += cargaHoraria * notaAluno;
				somaCargaHoraria += cargaHoraria;
				listaMatricula.add(matriculaAtual);
			}else {
				crAluno.add(somaCr/somaCargaHoraria);
				somaCr = cargaHoraria * notaAluno;
				somaCargaHoraria = cargaHoraria;
				listaMatricula.add(matriculaAtual);
			}

		}
		somaNotas = 0;
		for(Integer numero: crAluno) {
			somaNotas += numero;
		}

		return somaNotas /curso.getAlunosCursantes().size();
	}

}
