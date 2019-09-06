package edu.ifal.academico.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ifal.academico.construidor.CriadorDeEstudante;
import edu.ifal.academico.modelo.Endereco;
import edu.ifal.academico.modelo.Estudante;

public class ControleNotasTest {
	
	private ControleNotas controleNotas;
	private Estudante estudante;
	private CriadorDeEstudante criadorDeEstudante;
	private Endereco endereco;
	
	@Before
	public void inicializacao() {
		controleNotas = new ControleNotas();
		criadorDeEstudante = new CriadorDeEstudante();
		endereco = new Endereco();
		estudante = criadorDeEstudante.nome("Clara")
				.mora(endereco).constroi();
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
	
	@Test
	public void deveAprovarComMediaMaiorQueSeis() {
		
		estudante.setMedia(7);
		
		String situacaoEsperada = "Aprovado";
		String situacaoObtida = controleNotas.getSituacao(estudante);
		
		assertEquals(situacaoEsperada, situacaoObtida);
	}
	
	@Test
	public void deveIrParaARecuperacaoFinalComMediaQuatro() {
		
		estudante.setMedia(4);
		
		String situacaoEsperada = "Recuperação Final";
		String situacaoObtida = controleNotas.getSituacao(estudante);
		
		assertEquals(situacaoEsperada, situacaoObtida);
	}
}
