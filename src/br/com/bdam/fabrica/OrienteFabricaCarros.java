package br.com.bdam.fabrica;

import br.com.bdam.carro.ICarro;
import br.com.bdam.carro.OrienteCarro;

public class OrienteFabricaCarros implements IFabricaCarros {
	
	public void createCarro(String modelo) {
		ICarro carro = new OrienteCarro();
		carro.modelo(modelo);
		carro.potencia(modelo);
		System.out.println(carro.toString());
	}
	
}
