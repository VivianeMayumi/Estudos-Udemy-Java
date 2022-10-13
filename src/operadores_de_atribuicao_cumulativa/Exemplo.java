package operadores_de_atribuicao_cumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			//conta = conta + (minutos-100) * 2.00;
			conta += (minutos-100) * 2.00;
		}
		
		System.out.printf("O valor da conta = R$ %.2f%n ", conta);
		
		sc.close();
	}
}
/*
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
 * a 100 minutos de telefone. Cada minuto que excer a franquia de 100 minuots
 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
 * pessoa consumiu, daí mostrar o valor a ser pago.
 * 
 * Entrada: 22 Saída: Valor a pagar: R$ 50.00 Entrada: 103 Saída: Valor a pagar:
 * R$ 56.00
 */
