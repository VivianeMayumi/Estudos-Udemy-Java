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


/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de  pe�as 1,
 *  o valor unit�rio de cada  pe�a 1, o c�digo de uma  pe�a 2, o n�mero de  pe�as 2 e o valor unit�rio de 
 *  cada  pe�a 2. Calcule e mostre o valor a ser pago.
 *  
 * Exemplos:
 * Entrada:          			 Sa�da:
 * 12   1   5.30              VALOR A PAGAR: R$ 15.50  
 * 16   2   5.10          
 * 
 *  Entrada:                 Sa�da:
 * 13   2   15.30           VALOR A PAGAR: R$ 51.40
 * 161   4   5.20 
 * 
 *  Entrada:                Sa�da:
 *  1   1   15.10           VALOR A PAGAR: R$ 30.20 
 *  2   1   15.10          
 * */
