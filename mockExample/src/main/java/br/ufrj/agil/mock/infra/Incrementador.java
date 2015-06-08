package br.ufrj.agil.mock.infra;

import br.ufrj.agil.mock.model.ObjetoSimples;

public class Incrementador {

	public Integer incrementar(ObjetoSimples objeto, Integer incremento) {
		return objeto.getValorCorrente() + incremento;
	}
}
