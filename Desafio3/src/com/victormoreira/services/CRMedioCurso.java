package com.victormoreira.services;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;
import com.victormoreira.models.Disciplina;
import com.victormoreira.models.Universidade;

public class CRMedioCurso {

	public static BigDecimal calcular(Curso curso, Universidade universidade) {

		ArrayList<BigDecimal> listaCRAluno = new ArrayList<BigDecimal>();
		List <String> cargas = new ArrayList<String>();
		List <String> notass = new ArrayList<String>();

		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			Aluno aluno = curso.getAlunosCursantes().get(i);
			listaCRAluno.add(CoeficienteRendimento.calcular(aluno, universidade));	
		}
		BigDecimal somaCR = BigDecimal.ZERO;
		for( BigDecimal cr : listaCRAluno) {
			somaCR = somaCR.add(cr);
		}
		BigDecimal tamanhoAlunos = new BigDecimal(curso.getAlunosCursantes().size());
		MathContext mc = new MathContext(2, RoundingMode.HALF_DOWN) ;

		return  somaCR.divide(tamanhoAlunos, RoundingMode.HALF_DOWN);
	}

}
