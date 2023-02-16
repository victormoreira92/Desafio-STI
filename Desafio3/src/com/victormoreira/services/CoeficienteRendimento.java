package com.victormoreira.services;

import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;

public class CoeficienteRendimento {
	
	
	public static double calcular(Aluno aluno) {
		Integer cargaHoraria = 0;
		Integer notaAluno = 0;
		Integer somaCr = 0;
		Integer somaCargaHoraria = 0;
		
		for(int i = 0; i < aluno.getDisciplnasCursadas().size(); i++ ) {
			cargaHoraria = Integer.parseInt(aluno.getDisciplnasCursadas().get(i).getCargaHoraria());
			notaAluno = aluno.getNotas().get(i);
			
			somaCr += cargaHoraria * notaAluno;
			somaCargaHoraria += cargaHoraria;
			
		}
		
		return somaCr / somaCargaHoraria;
	}

}
