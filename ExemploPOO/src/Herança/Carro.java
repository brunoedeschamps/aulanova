package Herança;

public class Carro extends Veiculo{
	
	private String ano;
	
	//Construtor vazio de herança
	public Carro() {
		super();
	}

	//Construtor cheio de herança
	public Carro(String ano) {
		super();
		this.ano = ano;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	
	
}
