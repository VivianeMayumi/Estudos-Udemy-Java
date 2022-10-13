package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n ", preco);
		
		sc.close();
	}
}
/*Fazer um programa para ler as medidas da largura e comprimento de um terreno 
 * retangular com uma casa decimal, bem como valor do metro quadrado do terreno com duas casas decimais.
 * Em seguida, o progrma deve mostrar o valor da �rea do terreno, bem como o valor do pre�o do terreno,
 * ambos com duas casas decimais, conforme exemplo:
 * 
 * Exemplo:
 * 
 * Entrada:             Sa�da:
 * 10.0				AREA = 300.00
 * 30.0				PRECO = 60000.00
 * 200.0                               
 * */