package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double triangulo = a * c / 2;
		double circulo = 3.14159 * Math.pow(c, 2);
		double trapezio = (a + b) / 2.0 * c;
		double quadrado = b * b;
		double retangulo = a * b;

		System.out.printf("TRI�NGULO : %.3f%n", triangulo);
		System.out.printf("CIRCULO : %.3f%n", circulo);
		System.out.printf("TRAPEZIO : %.3f%n", trapezio);
		System.out.printf("QUADRADO : %.3f%n", quadrado);
		System.out.printf("RETANGULO : %.3f%n", retangulo);

		sc.close();

	}

}


/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: 
 * A, B e C. Em seguida, calcule e mostre:
 * a) a �rea do tri�ngulo ret�ngulo que tem A por base C por altura.
 * b)  a �rea do circulo de raio C.(pi = 3.14159)
 * c)a �rea do trap�zio que tem A e B por base  e C por altura.
 * d) a �rea do quadrado que tem lado B.
 * e) a �rea do ret�ngulo que tem lados A e B.
 * 
 * Entrada: 			Sa�da:
	3.0 4.0 5.2 		TRIANGULO: 7.800
							CIRCULO: 84.949
							TRAPEZIO: 18.200
							QUADRADO: 16.000
							RETANGULO: 12.000
							
Entrada:				Sa�da:
12.7 10.4 15.2 		TRIANGULO: 96.520
							CIRCULO: 725.833
							TRAPEZIO: 175.560
							QUADRADO: 108.160
							RETANGULO: 132.080    */
