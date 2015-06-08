package br.ufrj.agil.mock.infra.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import br.ufrj.agil.mock.infra.Incrementador;
import br.ufrj.agil.mock.model.ObjetoSimples;

public class IncrementadorTest {

	@Test(expected = NullPointerException.class)
	public void naoUtilizarMockParaOObjetoSimples() {
		final Integer valorDoIncremento = 10;
		ObjetoSimples objeto = new ObjetoSimples();
		Incrementador incrementador = new Incrementador();

		incrementador.incrementar(objeto, valorDoIncremento);
	}

	@Test
	public void incrementarEm10EReceberOValor20() {
		final Integer valorCorrente = 20;
		final Integer valorDoIncremento = 10;
		final Integer valorEsperado = valorCorrente + valorDoIncremento;

		ObjetoSimples objeto = Mockito.mock(ObjetoSimples.class);
		Incrementador incrementador = new Incrementador();

		when(objeto.getValorCorrente()).thenReturn(valorCorrente);

		Integer valorRecebido =  incrementador.incrementar(objeto, valorDoIncremento);


		assertThat(valorRecebido, equalTo(valorEsperado));
	}

}
