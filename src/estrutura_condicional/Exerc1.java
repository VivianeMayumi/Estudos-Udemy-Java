package estrutura_condicional;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Digite o número: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Este númeor é: Negativo");
		} else {
			System.out.println("Este númeor é: Não Negativo");
		}

		sc.close();

	}
}


/*Fazer um programa para ler um número inteiro, e depois dizer se 
  este número é negativo ou não.

 Exemplos:
 	Entrada: -10                          Saída: NEGATIVO
 	Entrada:    8                          Saída: NÃO NEGATIVO
 	Entrada:    0                          Saída: NÃO NEGATIVO        */
