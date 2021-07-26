package edu.ifsp.teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import edu.ifsp.converte.ConverteSegundos;
public class ConverteSegundosTest {

private ConverteSegundos converte;
	
	@Before
	public void inicializa() {
		this.converte = new ConverteSegundos();
	}
	
	@Test
	public void deveRetornar3600QuandoFor1Hora() {
		int segundos = converte.converteSegundos(1, 0, 0);
		assertEquals(3600, segundos);		
	}
	
	@Test
	public void deveRetornar60QuandoFor1Minuto() {
		int segundos = converte.converteSegundos(0, 1, 0);
		assertEquals(60, segundos);		
	}
	
	@Test
	public void deveRetornar1QuandoFor1Segundo() {
		int segundos = converte.converteSegundos(0, 0, 1);
		assertEquals(1, segundos);		
	}
	
	@Test
	public void deveRetornar86399QuandoForTudoNoMaximo() {
		int segundos = converte.converteSegundos(23, 59, 59);
		assertEquals(86399, segundos);		
	}
	
	@Test
	public void deveRetornar3661QuandoForTudoNoMinimo() {
		int segundos = converte.converteSegundos(1, 1, 1);
		assertEquals(3661, segundos);		
	}
	

}
