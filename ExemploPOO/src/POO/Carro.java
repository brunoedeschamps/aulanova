package POO;

public class Carro {

	// Declarando os atributos da classe;
	
	private String modelo;
	private String cor;
	private String ano;
	
	//Declarando o construtor vazio;
	public Carro() {
		
	}
	
	//Declarando o construtor cheio;
	public Carro(String modelo, String cor, String ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	//Criando os Getters e Setters;
	public String getModelo() {
		return this.modelo;
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

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	//Declarar os demais métodos;
	public void acelerar() {
		System.out.println("O carro está em movimento!");
	
	}
}


