package Heran�a;

public class Carro extends Veiculo{
	
	private String ano;
	
	//Construtor vazio de heran�a
	public Carro() {
		super();
	}

	//Construtor cheio de heran�a
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
