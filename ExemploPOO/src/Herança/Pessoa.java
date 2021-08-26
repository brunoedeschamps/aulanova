package Heranša;

public class Pessoa {
	
	private String nome;
	private String enderešo;
	private boolean status;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
