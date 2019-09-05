package edu.ifal.academico.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ifal.academico.modelo.Estudante;

public class ControleNotasTest {
	
	private ControleNotas controleNotas;
	private Estudante estudante;
	
	
	@Before
	public void inicializacao() {
		controleNotas = new ControleNotas();
		estudante = new Estudante();
	}
	
	@Test
	public void deveAceitarANotaIgualADez() {
		Double nota = 10.0;
		
		boolean validadeEsperada = true;
		boolean validadeObtida = controleNotas.validarNota(nota);
		
		assertEquals(validadeEsperada, validadeObtida);
	}
	
	@Test
	public void naoDeveAceitarNotaMaiorQueDez() {
		
		Double nota = 11.0;
		
		boolean validadeEsperada = false;
		boolean validadeObtida = controleNotas.validarNota(nota);
		
		assertEquals(validadeEsperada, validadeObtida);
	}
	
	@Test
	public void deveAceitatMenorQueDez() {
		 
		double nota = 9.0;
		
		boolean validadeEsperada = true;
		boolean validadeObtida = controleNotas.validarNota(nota);
		
		assertEquals(validadeEsperada,validadeObtida);
	}
	
	@Test
	public void DeveAceitarNotaIgualAZero() {
		
		double nota = 0;
		
		boolean validadeEsperada = true;
		boolean validadeObtida = controleNotas.validarNota(nota);
		
		assertEquals(validadeEsperada,validadeObtida);
		
	}
	
	@Test 
	public void naoDeveAceitarNotaMenorQueZero() {
		
		double nota = -1;
		
		boolean validadeEsperada = false;
		boolean validadeObtida = controleNotas.validarNota(nota);
		
		assertEquals(validadeEsperada, validadeObtida);
	}
	
	@Test
	
	public void deveAceitarNotaMaiorqueZero() {
		
		double nota = 1.0;
		
		boolean validadeEsperada = true;
		boolean validadeObtida = controleNotas.validarNota(nota);
		
		assertEquals(validadeEsperada,validadeObtida);
	}
	
	@Test
	public void deveAprovarComMediaSeis() {
		
		estudante.setMedia(6);
		
		String situacaoEsperada = "Aprovado";
		String situacaoObtida = controleNotas.getSituacao(estudante);
		
		assertEquals(situacaoEsperada, situacaoObtida);
	}
}
