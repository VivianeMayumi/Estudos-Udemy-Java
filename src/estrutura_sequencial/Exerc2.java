package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double pi = 3.14159;
		double a = pi * Math.pow(r, 2);

		System.out.printf("A = %.4f%n", a);

		sc.close();
	}
}

/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor 
 * da �rea deste c�ruclo com quatro casa decimais conforme exemplos.
 * 
 * F�rmula da �rea : PI.raio� 
 * Considere o valor de PI = 3.14159 
 * 
 * Exemplos:
	Entrada:       Sa�da:
	2.00                A=12.5664
	Entrada: 		Sa�da:
	100.64			A=31819.3103
	Entrada: 		Sa�da:
	150.00 			A=70685.7750
 */
