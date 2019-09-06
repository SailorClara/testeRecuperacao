package edu.ifal.academico.construidor;

import edu.ifal.academico.modelo.Endereco;
import edu.ifal.academico.modelo.Estudante;

public class CriadorDeEstudante {
	
	Estudante estudante;
	
	public CriadorDeEstudante (){
		
	}
	
	public CriadorDeEstudante nome(String nome) {
		estudante = new Estudante();
		estudante.setNome(nome);
		return this;
	}
	
	public CriadorDeEstudante mora(Endereco endereco) {
		estudante.setEndereco(endereco);
		return this;
	}
	
	public Estudante constroi () {
		
		return estudante;
	}
}
