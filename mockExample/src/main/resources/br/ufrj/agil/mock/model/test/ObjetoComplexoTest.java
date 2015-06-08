package br.ufrj.agil.mock.model.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.Test;

import br.ufrj.agil.mock.model.ObjetoComplexo;

public class ObjetoComplexoTest {

	@Test(expected = NullPointerException.class)
	public void naoUtilizarMock() {
		final Integer valorDoIncremento = 10;
		ObjetoComplexo objeto = new ObjetoComplexo();

		objeto.incrementar(valorDoIncremento);
	}

	@Test
	public void incrementarEm10EReceberOValor20() {
		final Integer valorCorrente = 20;
		final Integer valorDoIncremento = 10;
		final Integer valorEsperado = valorCorrente + valorDoIncremento;

		ObjetoComplexo objeto = spy(new ObjetoComplexo());

		when(objeto.getValorCorrente()).thenReturn(valorCorrente);

		Integer valorRecebido = objeto.incrementar(valorDoIncremento);

		assertThat(valorRecebido, equalTo(valorEsperado));
	}
}
