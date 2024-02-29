package br.com.fiap.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.fiap.model.Calculadora;

public class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	double res;
	
	@Test
	public void somar10com5() {
		res = calc.somar(10, 5);
		assertEquals(res, 15, 0);
	}
	
	@Test
	public void somar5ponto7com8ponto9(){
		res = calc.somar(5.7, 8.9);
		assertEquals(res, 14.6, 0.6);
	}
	
	@Test
	public void subtrair5de10() {
		res = calc.subtrair(10, 5);
		assertEquals(res, 5, 0);
	}
	
	@Test
	public void subtrair5ponto3de9ponto6() {
		res = calc.subtrair(9.6, 5.3);
		assertEquals(res, 4, 0.3);
	}
	

}
