package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 & y == 0.0) {
			System.out.println("Origem");
		}
		else if(x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x >0.0 & y >0.0) {
			System.out.println("Q1");
		}
		else if (x <0.0 & y >0.0) {
			System.out.println("Q2");
		}
		else if (x <0.0 & y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}			
		sc.close();
	}
}


/*Leia 2 valores com uma casa decimal (x e y ), que devem representar as coordenadas de um ponto 
 * em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, 
 * ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * 
 * Se o ponto estiver na origem, escreva a ,ensagem "Origem".
 * 
 * Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme for a situa��o.
 * 
 * Exemplos:
 * Entrada: 4.5		-2.2			Sa�da: Q4            
 * Entrada: 0.1		0.1			Sa�da: Q1
 * Entrada: 0.0		0.0			Sa�da: Origem
 * */
