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


/*Faça um programa para ler dois valores 
 * inteiros, e depois mostrar na tela a soma desses números com uma
 mensagem explicativa, conforme exemplos.

Exemplos:      
 Entrada:		Saída:	
 10				SOMA = 40
 30                     
 
 Entrada:		Saída:	
 -30			   SOMA = -20
  10               
 
 Entrada:		Saída:	
 0				   SOMA = 0
 0             
 */
