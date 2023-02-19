package com.victormoreira.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Universidade;

public class CoeficienteRendimento {
	
	
	public static BigDecimal calcular( Aluno aluno, Universidade universidade) {
		Integer cargaHoraria = 0;
		Double notaAluno = 0.0;
		Double somaCr = 0.0;
		Double somaCargaHoraria = 0.0;
		
		
		for(int i = 0; i < aluno.getDisciplnasCursadas().size(); i++ ) {
			String disciplina = aluno.getDisciplnasCursadas().get(i);
			cargaHoraria = Integer.parseInt(Secretaria.encontrarCargaHorariaPorDisciplina(disciplina, universidade));
			notaAluno = Double.parseDouble(aluno.getNotasDoAluno().get(i));
			somaCr += cargaHoraria * notaAluno;
			somaCargaHoraria += cargaHoraria;
		}


		return new BigDecimal(somaCr/somaCargaHoraria).setScale(2, RoundingMode.HALF_DOWN);
	}
	

}
