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
/**
 * Classe utilitária que calcula o CR médio de um curso.
 * @author victormoreira
 * */
public class CRMedioCurso {
/**
 * Calcula o CR médio de um curso, calculado o CR de cada aluno cadastrado no curso e 
 * depois realiza a média  com o numero de aluno.
 * 
 * @param Curso curso, Universidade universidade
 * @return BigDecimal
 * */
	public static BigDecimal calcular(Curso curso, Universidade universidade) {

		ArrayList<BigDecimal> listaCRAluno = new ArrayList<BigDecimal>();
	
		for(int i = 0; i < curso.getAlunosCursantes().size(); i++ ) {
			Aluno aluno = curso.getAlunosCursantes().get(i);
			listaCRAluno.add(CoeficienteRendimento.calcular(aluno, universidade));	
		}
		BigDecimal somaCR = BigDecimal.ZERO;
		for( BigDecimal cr : listaCRAluno) {
			somaCR = somaCR.add(cr);
		}
		BigDecimal tamanhoAlunos = new BigDecimal(curso.getAlunosCursantes().size());

		return  somaCR.divide(tamanhoAlunos, RoundingMode.HALF_DOWN);
	}

}
