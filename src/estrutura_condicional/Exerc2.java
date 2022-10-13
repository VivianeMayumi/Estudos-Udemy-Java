package estrutura_condicional;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número : ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Este númeor é: ÍMPAR");

		} else {
			System.out.println("Este númeor é: PAR");
		}
		sc.close();
	}
}


/*Fazer um programa para ler um número inteiro e dizer se este número 
	é par ou ímpar.
	Exemplos:
	Entrada: 12    Saída: PAR
	Entrada: -27   Saída: IMPAR
	Entrada: 0      Saída: PAR       */
