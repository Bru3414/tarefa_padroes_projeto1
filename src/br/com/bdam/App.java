package br.com.bdam;
import br.com.bdam.fabrica.IFabricaCarros;
import br.com.bdam.fabrica.OcidenteFabricaCarros;
import br.com.bdam.fabrica.OrienteFabricaCarros;

public class App {

	public static void main(String[] args) {
		IFabricaCarros fabricaOcidente = new OcidenteFabricaCarros();
		IFabricaCarros fabricaOriente = new OrienteFabricaCarros();
		
		new Compra(fabricaOcidente, "A");
		new Compra(fabricaOriente, "B");
		new Compra(fabricaOcidente, "C");
		new Compra(fabricaOriente, "A");
		
		
	}

}
