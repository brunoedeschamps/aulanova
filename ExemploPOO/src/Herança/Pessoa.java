package Heran�a;

public class Pessoa {
	
	private String nome;
	private String endere�o;
	private boolean status;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
