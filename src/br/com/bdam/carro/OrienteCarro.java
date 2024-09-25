package br.com.bdam.carro;

public class OrienteCarro implements ICarro {
	private String modelo;
	private String potencia;

	public void modelo(String modelo) {
		switch (modelo) {
		case "A":
			this.modelo = "BYD";
			break;
		case "B":
			 this.modelo = "Chery";
			 break;
		case "C":
			this.modelo = "BAIC";
			break;
		default:
			System.out.println("Modelo não encontrado");
		}
	}

	public void potencia(String modelo) {
		switch (modelo) {
		case "A":
			this.potencia = "81HP";
			break;
		case "B":
			 this.potencia = "150cv";
			 break;
		case "C":
			this.potencia = "250cv";
			break;
		default:
			System.out.println("Modelo não encontrado");
		}
	}

	@Override
	public String toString() {
		return "OrienteCarro [modelo=" + modelo + ", potencia=" + potencia + "]";
	}
}
