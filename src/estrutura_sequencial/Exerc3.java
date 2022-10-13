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

		System.out.println("DIFERENÇA: " + diferenca);

		sc.close();

	}

}

/*Fazer um programa para ler quatro valores inteiros A, B,C e D.
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
a fórmula: DIFERENÇA =(A*B-C*D).
Exemplos: 
	Entrada:             Saída:    
	5                         DIFERENÇA = -26
	6
	7
	8
	Entrada:             Saída:    
	5                         DIFERENÇA = 86
	6
	-7
	8                       
*/
