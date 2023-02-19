package com.victormoreira.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;
import com.victormoreira.models.Disciplina;
import com.victormoreira.models.Universidade;

public class CRMedioCurso {

	public static BigDecimal calcular(Curso curso) {

		ArrayList<Double> listaCRAluno = new ArrayList<Double>();
		List <String> cargas = new ArrayList<String>();
		List <String> notass = new ArrayList<String>();

		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			Aluno aluno = curso.getAlunosCursantes().get(i);
			listaCRAluno.add(CoeficienteRendimento.calcular(aluno));	
		}
		Double somaCR = 0.0;
		for( Double cr : listaCRAluno) {
			somaCR += cr;
		}
		
		return  new BigDecimal(somaCR/curso.getAlunosCursantes().size()).setScale(2, RoundingMode.HALF_DOWN);
	}

}
