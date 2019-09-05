package edu.ifal.academico.modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
	private List<Estudante> estudantes;
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
		this.estudantes = new ArrayList<Estudante>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}
	
	public void addEstudante(Estudante estudante) {
		this.estudantes.add(estudante);
	}

}
