package application;

import models.Aluno;
import models.Curso;
import models.Universidade;
import services.CRMedioCurso;
import services.CarregarDadosCSV;
import services.CoeficienteRendimento;

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
