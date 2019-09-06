package edu.ifal.academico.construidor;

import edu.ifal.academico.modelo.Disciplina;
import edu.ifal.academico.modelo.Endereco;
import edu.ifal.academico.modelo.Estudante;

public class CriadorDeDisciplina {
  
	Disciplina disciplina;
	
	public CriadorDeDisciplina () {
		
	}
	
	public CriadorDeDisciplina nome(String nome) {
		
		disciplina = new Disciplina (nome);
		
		return this;
		
	}
	
	public CriadorDeDisciplina mora(Estudante estudante) {
		disciplina.addEstudante(estudante);
		return this;
	}
	
	public Disciplina constroi () {
		
		return disciplina;
	}
}
