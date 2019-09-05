package edu.ifal.academico.controle;

import edu.ifal.academico.modelo.Estudante;

public class ControleNotas {
	
	public boolean validarNota(double nota) {
		if(nota>=0 && nota<=10)
			return true;
		return false;
	}
	
	public double mediaPonderada(double nota1, double peso1, double nota2, double peso2) {
		double media = (nota1*peso1+nota2*peso2)/(peso1+peso2);
		return media;
	}
	
	public boolean aprovacao(Estudante estudante) {
		double media = estudante.getMedia();
		if(media >= 6)
			return true;
		else
			return false;
	}
	
	public String getSituacao(Estudante estudante) {
		double media = estudante.getMedia();
		String situacao = "Reprovado";
		
		if(aprovacao(estudante)) {
			situacao = "Aprovado";
		} else {
			if(media >= 4) {
				situacao = "Recuperação Final";
			}
		}		
		
		return situacao;
	}

}
