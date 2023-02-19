package com.victormoreira.application;

import com.victormoreira.models.Aluno;
import com.victormoreira.models.Curso;
import com.victormoreira.models.Universidade;
import com.victormoreira.services.CRMedioCurso;
import com.victormoreira.services.CarregarDadosCSV;
import com.victormoreira.services.CoeficienteRendimento;

public class CalculoCRAplication {

	public static void main(String[] args) throws Exception {
		 Universidade universidade = new Universidade();
		 
		 universidade = CarregarDadosCSV.carregarDados();
		 System.out.println("----------------------------------");
		 System.out.println("------ CR DOS ALUNOS---------");
		 for(Aluno aluno: universidade.getAlunosMatriculados()) {
			 System.out.println(aluno.getMatricula()+"  -   "+CoeficienteRendimento.calcular(aluno, universidade));
		 }
		 
		 System.out.println("----------------------------------");
		 System.out.println("-----Média dos CR dos Cursos ---------");
		 for(Curso curso: universidade.getCursosOferecidos()) {
			 System.out.println(curso.getCodCurso()+"  -   "+CRMedioCurso.calcular(curso, universidade));
		 }
		 System.out.println("----------------------------------");

	}

}
