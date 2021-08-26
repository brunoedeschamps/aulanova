import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		/*String[] nomes = new String[5];
		 
		  nomes[0] = "João";
		  nomes[1] = "Nina";
		  nomes[2] = "Alberto";
		  nomes[3] = "Bartolomeu";
		  nomes[4] = "Estevão";
	
		 Selecione o terceiro elemento;
		
		for(int i = 0; i < 5; i++)
		System.out.println(nomes[i]);
		
		 inserindo valores no array dentro de um laço
		
		  for(int i = 0; i<alunos.length; i++)
		  	alunos[i] = scan.next();
		 
		 lendo valors do array dentro de um laço
		  
		  for(int i = 0; i< alunos.legth; i++;
		  	alunos[i] = sysout
		
		
		/*Crie um array para receber 5 números inteiros atráves de um laço de repetição
		 * Percorra o array atráves do laço,e para cada elemento compare:
		 * 
		 * Se o elemento for "par", imprima as operações de soma e multiplicação entre o elemento e o contador;
		 * Se o elemento for "impar", imprima as operações de subtração e divisão entre o elemento e o contador;
		 * 
		 */
		 
		/*int[] numeros = new int[5];
		
		for(int i = 0; i<5; i++) {
			numeros[i] = i;
			}
		
		for (int i = 0; i < 5; i++ ) {
			if(i % 2 == 0) {
				System.out.println( i + " É par |" + "Soma = " + (i + numeros[i]) + " | Multiplicação = " + i * numeros[i]);
			} else {
				System.out.println( i + " É impar |" + "Subtração = " + (i - numeros[i]) + " | Divisão = " + i/numeros[i]);
		}
	 }*/
		
	/*	String[] nomes = {"Ana", "Beatriz", "Carlos", "Júlio", "Antonio"};
		
		for(int i = nomes.length -1; i >= 0; i--) {
			System.out.println(nomes[i]);
		
		
		//for(String n : nomes) {
		//	System.out.println(n);
		} */
		
		/* Crie um array para receber 5 notas de alunos (números decimais) atráves de laço de repetição.
		 * Percorra o array de notas, e faça a média simples das mesmas notas (total de notas dividido por 5);
		 * 
		 * Caso a média for maior ou igual à 8, imprima "Aprovado";
		 * Caso a média for maior que 4 e menor que 8, imprima "Recuperação";
		 * Caso a média for menor que 4, imprima "Reprovado";
		 */
		 
	/*	double[] notas = new double[5];
		
		Scanner nota = new Scanner(System.in);
		
		
		System.out.println("Digite as notas:");
		for(int i = 0; i<notas.length; i++)
			notas[i] = nota.nextDouble();
		
		double media = 0;
						
		
		for(int i = 0; i< notas.length; i++) {
			media = media + notas[i];
		}
		
		media = media/5;
		
		System.out.println("Média: "+ (media));
		
		if(media >= 8) {
			System.out.println("Aprovado");
		} else if (media >= 4 && media < 8) {
			System.out.println("Recuperação");
		} else if (media < 4 ) {
			System.out.println("Reprovado");
		}
		*/	
		
		//Declarar ArrayList
		List<String> nomes = new ArrayList<>();
		
		//Inserir valores no ArrayList
		
		nomes.add("Tiago");
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.add("Joana");
		nomes.add("Maria");
		
		System.out.println(nomes.size());
		
		// Imprimir uma detereminada posição
		System.out.println(nomes.get(1));
		
		// Imprimindo o index a partir de uma referencia
		System.out.println(nomes.indexOf("Xavier"));
		
		//Remover do ArrayList em uma posição especifica
		nomes.remove(2);
		
		
		//Percorrendo o ArrayList
		for(String nome : nomes) {
			System.out.println(nome);
			
		}
		
		
		
		
		
		
		
		
			
		
			
		
		
	} 
}


