package estrutura_sequencial;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int diferenca = (a * b - c * d);

		System.out.println("DIFEREN�A: " + diferenca);

		sc.close();

	}

}

/*Fazer um programa para ler quatro valores inteiros A, B,C e D.
A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo
a f�rmula: DIFEREN�A =(A*B-C*D).
Exemplos: 
	Entrada:             Sa�da:    
	5                         DIFEREN�A = -26
	6
	7
	8
	Entrada:             Sa�da:    
	5                         DIFEREN�A = 86
	6
	-7
	8                       
*/
