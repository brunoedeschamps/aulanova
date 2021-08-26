package POO;

public class Main {

	public static void main(String[] args) {

	/*	// Instaciando um objeto vazio da classe Carro
		Carro carro1 = new Carro();
		
		//Inserindo valores atraves dos método Set
		carro1.setModelo("HB20");
		carro1.setCor("Preto");
		carro1.setAno("2021");
		
		//Obtendo valores através dos métodos Get
		System.out.println("Caracteristicas de Carro 1");
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Ano: " + carro1.getAno());
		//Acessando métodos da classe através do objeto
		carro1.acelerar();
		
		//Instaciando um objeto cheio da classe Carro
		Carro carro2 = new Carro("Gol", "Branco", "2020");
		
		System.out.println("Caracteristicas de Carro 2");
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Ano: " + carro2.getAno());
		
		carro2.acelerar();
	}
*/
		
	Funcionario funcionario1 = new Funcionario();
	
	funcionario1.setNome("João");
	funcionario1.setCpf("111.111.111-11");
	funcionario1.setSalario(1000.00);
	
	System.out.println("Caracteristicas de Funcionário 1");
	System.out.println("Nome: " + funcionario1.getNome());
	System.out.println("CPF: " + funcionario1.getCpf());
	System.out.println("Salário: " + funcionario1.getSalario());
	
	funcionario1.receberBonus();
	funcionario1.pagarPenalidade();
	funcionario1.mostrarSalario();
	
	Funcionario funcionario2 = new Funcionario();
	
	funcionario2.setNome("Maria");
	funcionario2.setCpf("222.222.222-22");
	funcionario2.setSalario(2000.00);
	
	System.out.println("Caracteristicas de Funcionário 2");
	System.out.println("Nome: " + funcionario2.getNome());
	System.out.println("CPF: " + funcionario2.getCpf());
	System.out.println("Salário: " + funcionario2.getSalario());
	
	funcionario2.receberBonus();
	funcionario2.pagarPenalidade();
	funcionario2.mostrarSalario();
	}
}

