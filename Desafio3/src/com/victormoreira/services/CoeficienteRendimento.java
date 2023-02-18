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
		Double somaCargaHoraria = 0.0;

		
		for(int i = 0; i < aluno.getDisciplnasCursadas().size(); i++ ) {
			cargaHoraria = Integer.parseInt(aluno.getDisciplnasCursadas().get(i).getCargaHoraria());
			notaAluno = Double.parseDouble(aluno.getNotas().get(i));

			somaCr += cargaHoraria * notaAluno;
			somaCargaHoraria += cargaHoraria;
		}
		
		return somaCr / somaCargaHoraria;
	}
	

}
