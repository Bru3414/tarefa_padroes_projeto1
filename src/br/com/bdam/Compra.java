package br.com.bdam;

import br.com.bdam.fabrica.IFabricaCarros;

public class Compra {	
	
	public Compra(IFabricaCarros fabricaCarros, String modelo) {
		fabricaCarros.createCarro(modelo);
	}

}
