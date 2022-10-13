package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double entrada = sc.nextDouble();
	
		if(entrada <0.0 || entrada >100.0) {
			System.out.println("Fora do intervalo");
		}
		else if (entrada <=25.0) {
				System.out.println("intervalo = (0, 25]");
		}
		else if (entrada <=50.0 ){
				System.out.println("intervalo =(25, 50]");
		}
		else if (entrada<=75.0) {
			System.out.println("intervalo = (50, 75]");
		}else {
			System.out.println("intervalo = (75,100]");
		}
		sc.close();
	}
}

/*Você deve fazer um programa que leia um valor qualquer e apresente uma 
 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
 * este valor se encontra. Obviamente se o valor não estiver em nenhum destes
 *  intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 *  
 *  Exemplos:
 *  Entrada: 25.01				Saída: Intervalo (25, 50]
 *  Entrada: 25.00				Saída: Intervalo [0, 25]
 *  Entrada: 100.00				Saída: Intervalo (75, 100]
 *  Entrada: - 25.02			    Saída: Fora de intervalo
 * 		
 * 
 * 	*/
