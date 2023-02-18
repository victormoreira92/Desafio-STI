package com.victormoreira.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;
import com.victormoreira.models.Disciplina;

public class CRMedioCurso {

	public static BigDecimal calcular(Curso curso) {

		List<Double> crAluno = new ArrayList<Double>();
		List <String> cargas = new ArrayList<String>();
		List <String> notass = new ArrayList<String>();

		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			Aluno aluno = curso.getAlunosCursantes().get(i);
			crAluno.add(CoeficienteRendimento.calcular(aluno));	
		}
		Double somaNotas = 0.0;
		for( Double notas : crAluno) {
			somaNotas += notas;
		}
		
		return  new BigDecimal(somaNotas/curso.getAlunosCursantes().size()).setScale(2, RoundingMode.HALF_DOWN);
	}

}
