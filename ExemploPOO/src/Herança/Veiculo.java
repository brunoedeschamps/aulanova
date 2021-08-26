package Herança;

public class Veiculo {

	private String modelo;
	private String cor;
	private boolean estado;
	
	
	public Veiculo() {
		
	}
	
	public Veiculo(String modelo, String cor, boolean estado) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.estado = estado;
	}

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void acelerar() {
		this.estado = true;
		System.out.println("O carro começou a andar.");
	}
	
	public void parar() {
		this.estado = false;
		System.out.println("O carro parou.");
		
	}
	
	public void mostrarEstado() {
		if (this.estado == true) {
			System.out.println("O carro está em movimento!");
		} else {
			System.out.println("O carro está parado!");
		}
			
	}
	
}



