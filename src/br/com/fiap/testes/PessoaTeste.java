package br.com.fiap.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.fiap.model.Pessoa;

public class PessoaTeste {

Pessoa pessoa = new Pessoa();
	
	//Teste de Getter e setter
	@Test
	public void testeAtribuirNomeRenato() {
		pessoa.setNome("Gabriel");
		assertEquals(pessoa.getNome(), "Gabriel");
	}
	
	@Test
	public void testeAtribuirPesoRenato() {
		pessoa.setPeso(70.1);
		assertEquals(pessoa.getPeso(), 70,0.1);
	}
}
