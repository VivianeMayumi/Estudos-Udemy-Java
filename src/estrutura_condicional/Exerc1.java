package estrutura_condicional;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Digite o n�mero: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Este n�meor �: Negativo");
		} else {
			System.out.println("Este n�meor �: N�o Negativo");
		}

		sc.close();

	}
}


/*Fazer um programa para ler um n�mero inteiro, e depois dizer se 
  este n�mero � negativo ou n�o.

 Exemplos:
 	Entrada: -10                          Sa�da: NEGATIVO
 	Entrada:    8                          Sa�da: N�O NEGATIVO
 	Entrada:    0                          Sa�da: N�O NEGATIVO        */
