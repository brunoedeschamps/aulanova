import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
//La�o de repeti��o
		//for(int i = 0(como come�a); i<=10(como termina); i++(como ele vai)) {
			//bloco de c�digos
		
		/*
		 * Receba um n�mero inteiro e imprima sua tabuada
		 */
		
	/*	Scanner numero = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o n�mero: ");
		num = numero.nextInt();
		
		System.out.println("Tabuada de " + num);
		for (int i = 1; i<=10; i++) {
			
			System.out.println( + num + " x " + i + " = " + num * i);
		}
		numero.close();
			
		*/
		
		/*
		 * Crie uma variavel com o nome "par"
		 * Crie uma variavel com o nome "impar"
		 * Receba um valor em uma terceira vari�vel;
		 * Execute um la�o de repeti��o at� o valor do numero recebido
		 * 
		 * Caso o numero for par, insira dentro da variavel "par"
		 * Caso o nuemro for impar, insira dentro da varial "impar;
		 *
		 */
		
		String par;
		String impar;
		int numvar;
		
		numvar = 10;
		
		for (int i = 0; i <= numvar; i++ ) {
			if(i % 2 == 0) {
				System.out.println( i + " � par");
			} else {
				System.out.println( i + " � impar");
			}
		}
		
		
		}
		
		
	}


