package br.com.fiap.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fiap.model.Elevador;

public class ElevadorTeste {

	Elevador ele = new Elevador();

	//Inicialização da Carga Atual do elevador
	@Before
	public void setUp() throws Exception {
		ele.setId(1);
		ele.setCargaAtual(0);
		ele.setCargaMaxima(200);
	}

	//Teste de entrada de uma pessoa no elevador
	@Test
	public void testeIncrementarPessoaCom100Kg() {
		ele.entrarNoelevador(100);
		assertEquals(ele.getCargaAtual(), 100, 0);
	}

	//Teste de entrada de duas pessoas na sequência, no elevador
	@Test
	public void testeIncrementarPessoaCom50KgMaisOutraDe100Kg() {
		ele.entrarNoelevador(50);
		ele.entrarNoelevador(100);
		assertEquals(ele.getCargaAtual(), 150, 0);
	}
	
	@Test
	public void testeRetirarPessoaCom80KgDepoisdeEmbarcarPessoaCom100Kg() {
		ele.entrarNoelevador(100);
		ele.sairDoelevador(80);
		assertEquals(ele.getCargaAtual(), 20, 0);
	}
	
	//Teste de alerta da entrada de duas pessoas com peso que não excede a capacidade do elevador
	@Test
	public void testeAlertaPessoaCom50KgMaisOutraDe100Kg() {
		ele.setCargaAtual(50);
		ele.entrarNoelevador(100);
		boolean alerta = ele.avaliarpeso(ele.getCargaAtual());
		assertEquals(alerta, false);
	}
	
	//Teste de alerta da entrada de duas pessoas com peso que excede a capacidade do elevador
	@Test
	public void testeAlertaPessoaCom120KgMaisOutraDe100Kg() {
		ele.entrarNoelevador(120);
		ele.entrarNoelevador(100);
		boolean alerta = ele.avaliarpeso(ele.getCargaAtual());
		assertEquals(alerta, true);
	}

}
