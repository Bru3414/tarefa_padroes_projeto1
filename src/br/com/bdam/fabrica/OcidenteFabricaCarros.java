package br.com.bdam.fabrica;

import br.com.bdam.carro.ICarro;
import br.com.bdam.carro.OcidenteCarro;

public class OcidenteFabricaCarros implements IFabricaCarros {

	public void createCarro(String modelo) {
		ICarro carro = new OcidenteCarro();
		carro.modelo(modelo);
		carro.potencia(modelo);
		System.out.println(carro.toString());
	}

}
