package Herança;

public class Main {
	
	public static void main(String[] args) {
		
	/*	Carro carro1 = new Carro();
		
		carro1.setAno("2021");
		carro1.setModelo("Fiesta");
		carro1.setCor("Vermelho");
		carro1.setEstado(false);
		
		System.out.println("Informações do Carro");
		System.out.println("Modelo: " + carro1.getModelo());	
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Ano: " + carro1.getAno());
		
		carro1.mostrarEstado();
		
		carro1.acelerar();
		carro1.mostrarEstado();
		
		carro1.parar();
		carro1.mostrarEstado();
		*/
		
		Fisica fisica1 = new Fisica();
		
		fisica1.setNome("Marcos da Silva");
		fisica1.setIdade(25);
		fisica1.setEndereço("Rua 7 de Setembro, N° 1200");
		fisica1.setCpf("111.111.111-11");
		fisica1.setStatus(true);
		
		System.out.println("INFORMAÇÕES PESSOA FÍSICA");
		System.out.println("Nome: " + fisica1.getNome());
		System.out.println("Idade: " + fisica1.getIdade());
		System.out.println("Endereço: " + fisica1.getEndereço());
		System.out.println("CPF: " + fisica1.getCpf());
		
		fisica1.procurarEmprego();
		fisica1.verFiscal();
		
		System.out.println("------------------------------");
		
		Juridica jur1 = new Juridica();
		
		jur1.setNome("SNI S/A");
		jur1.setCnpj("11.111.111/0001-11");
		jur1.setEndereço(" ");
		jur1.setStatus(false);
		
		System.out.println("INFORMAÇÕES PESSOA JURIDICA");
		System.out.println("Nome: " + jur1.getNome());
		System.out.println("CNPJ: " + jur1.getCnpj());
		System.out.println("Endereço: " + jur1.getEndereço());
		
		jur1.contratar();
		jur1.verFiscal();
		
		
		
	}
	
}
