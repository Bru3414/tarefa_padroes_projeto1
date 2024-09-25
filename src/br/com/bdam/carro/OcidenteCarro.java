package br.com.bdam.carro;

public class OcidenteCarro implements ICarro {
	
	private String modelo;
	private String potencia;

	public void modelo(String modelo) {
		switch (modelo) {
		case "A":
			this.modelo = "BMW";
			break;
		case "B":
			 this.modelo = "Tesla";
			 break;
		case "C":
			this.modelo = "Chevrolet";
			break;
		default:
			System.out.println("Modelo não encontrado");
		}
	}

	public void potencia(String modelo) {
		switch (modelo) {
		case "A":
			this.potencia = "300cv";
			break;
		case "B":
			 this.potencia = "200cv";
			 break;
		case "C":
			this.potencia = "350cv";
			break;
		default:
			System.out.println("Modelo não encontrado");
		}
	}

	@Override
	public String toString() {
		return "OcidenteCarro [modelo=" + modelo + ", potencia=" + potencia + "]";
	}

}
