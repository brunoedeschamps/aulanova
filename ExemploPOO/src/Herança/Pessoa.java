package Herança;

public class Pessoa {
	
	private String nome;
	private String endereço;
	private boolean status;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void verFiscal() {
		if (this.status == true) {
			System.out.println("Cadastro completo!");
		} else {
			System.out.println("Cadastro incompleto!");
		}
	}
}
