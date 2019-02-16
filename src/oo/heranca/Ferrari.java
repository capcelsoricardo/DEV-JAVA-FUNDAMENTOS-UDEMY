package oo.heranca;

public class Ferrari extends Carro {

	public Ferrari() {
		velocidade_maxima = 350;
	}

	public void acelerar() {
		super.acelerarMais(20);
	}
}
