package com.victormoreira.services;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;

public class CoeficienteRendimento {
	
	
	public static double calcular(Aluno aluno) {
		Integer cargaHoraria = 0;
		Double notaAluno = 0.0;
		Double somaCr = 0.0;
		Integer somaCargaHoraria = 0;
		DecimalFormat df = new DecimalFormat("#.##");      

		
		for(int i = 0; i < aluno.getDisciplnasCursadas().size(); i++ ) {
			cargaHoraria = Integer.parseInt(aluno.getDisciplnasCursadas().get(i).getCargaHoraria());
			notaAluno = Double.parseDouble(aluno.getNotas().get(i));

			somaCr += (cargaHoraria * notaAluno);
			somaCargaHoraria += cargaHoraria;

		}
		
		return Double.valueOf(somaCr / somaCargaHoraria);
	}
	
	/*public static double calcularPorCurso(Curso curso) {
		Integer cargaHoraria = 0;
		Integer notaAluno = 0;
		Integer somaCr = 0;
		Integer somaCargaHoraria = 0;
		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			cargaHoraria = Integer.parseInt(curso.getDisciplinasCurso().get(i).getCargaHoraria());
			notaAluno = curso.getAlunosCursantes().get(i).getNotas().get(0);
			
			somaCr += cargaHoraria * notaAluno;
			somaCargaHoraria += cargaHoraria;
			
		}
		
		return somaCr / somaCargaHoraria;
	}*/

}
