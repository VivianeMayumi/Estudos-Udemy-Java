package estrutura_condicional;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero : ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Este n�meor �: �MPAR");

		} else {
			System.out.println("Este n�meor �: PAR");
		}
		sc.close();
	}
}


/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero 
	� par ou �mpar.
	Exemplos:
	Entrada: 12    Sa�da: PAR
	Entrada: -27   Sa�da: IMPAR
	Entrada: 0      Sa�da: PAR       */
