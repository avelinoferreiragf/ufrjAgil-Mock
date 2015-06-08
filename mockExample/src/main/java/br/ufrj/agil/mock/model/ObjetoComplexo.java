package br.ufrj.agil.mock.model;

public class ObjetoComplexo {

	public Integer getValorCorrente() {
		return null;
	}

	public Integer incrementar(Integer incremento) {
		return this.getValorCorrente() + incremento;
	}
}
