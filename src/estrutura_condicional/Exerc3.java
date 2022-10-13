package estrutura_condicional;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Não sao multimplos");
		}

		sc.close();
	}
}

/*Leia 2 valores inteiros(A e B). Após,  o programa deve mostrar uma mensagem "Sao Multiplos
 	ou "Nao sao multiplos ", indicando se os valores lidos são múltiplos entre si. Atenção: os números 
 	devem poder ser digitados em ordem crescente ou decrescente.
 	
 	EXemplos:
 	Entrada: 6 24       Saída: Sao Multiplos
 	Entrada: 6 25       Saída: Nao sao Multiplos
 	Entrada: 24 6       Saída: Sao Multiplos    	 */
