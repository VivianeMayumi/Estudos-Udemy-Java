package estrutura_sequencial;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();

	}	 
}


/*Fa�a um programa para ler dois valores 
 * inteiros, e depois mostrar na tela a soma desses n�meros com uma
 mensagem explicativa, conforme exemplos.

Exemplos:      
 Entrada:		Sa�da:	
 10				SOMA = 40
 30                     
 
 Entrada:		Sa�da:	
 -30			   SOMA = -20
  10               
 
 Entrada:		Sa�da:	
 0				   SOMA = 0
 0             
 */
