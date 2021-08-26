package POO;

public class Funcionario {

	
	private String nome;
	private String cpf;
	private double salario;
	
		
	public Funcionario() {
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void receberBonus () {
		this.salario= salario + 500;
		System.out.println("Valor do salario com bonus: " + this.salario );
	}
	
	
	public void pagarPenalidade () {
		this.salario = this.salario - 100;
		System.out.println("Valor do salário com penalidade: " + this.salario);
	}
	
	public void mostrarSalario () {
		System.out.println("Salário: " + salario);
	}
		
		
	}

