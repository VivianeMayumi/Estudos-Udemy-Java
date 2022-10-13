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

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor 
 * da área deste círuclo com quatro casa decimais conforme exemplos.
 * 
 * Fórmula da área : PI.raio² 
 * Considere o valor de PI = 3.14159 
 * 
 * Exemplos:
	Entrada:       Saída:
	2.00                A=12.5664
	Entrada: 		Saída:
	100.64			A=31819.3103
	Entrada: 		Saída:
	150.00 			A=70685.7750
 */
