package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtePeca1, qtePeca2;
		double valorPeca1, valorPeca2;
		
		codPeca1 = sc.nextInt();
		qtePeca1 = sc.nextInt();
		 valorPeca1 = sc.nextDouble();
		
		 codPeca2 = sc.nextInt();
		 qtePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		System.out.printf("VALOR PAGAR: %.2f%n ",( qtePeca1*valorPeca1)+(qtePeca2*valorPeca2));

		sc.close();
	}
}


/*Fazer um programa para ler o código de uma peça 1, o número de  peças 1,
 *  o valor unitário de cada  peça 1, o código de uma  peça 2, o número de  peças 2 e o valor unitário de 
 *  cada  peça 2. Calcule e mostre o valor a ser pago.
 *  
 * Exemplos:
 * Entrada:          			 Saída:
 * 12   1   5.30              VALOR A PAGAR: R$ 15.50  
 * 16   2   5.10          
 * 
 *  Entrada:                 Saída:
 * 13   2   15.30           VALOR A PAGAR: R$ 51.40
 * 161   4   5.20 
 * 
 *  Entrada:                Saída:
 *  1   1   15.10           VALOR A PAGAR: R$ 30.20 
 *  2   1   15.10          
 * */
