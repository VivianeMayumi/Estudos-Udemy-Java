package estrutura_condicional;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double valor;
		if (codigo == 1) {
			valor = quantidade * 4.0;
		} else if (codigo == 2) {
			valor = quantidade * 4.5;
		} else if (codigo == 3) {
			valor = quantidade * 5.0;
		} else if (codigo == 4) {
			valor = quantidade * 2.0;
		} else {
			valor = quantidade * 1.5;
		}
		System.out.printf("Total da conta : R$ %.2f%n", valor);

		sc.close();
	}
}

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e 
a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar

*Codigo		Especificação			Preço*
	1				Cachorro quente	R$4.00
	2				X-Salada					R$4.50
	3				X-Bacon					R$5.00
	4				Torrada simples     R$2.00
	5				Refrigerante			R$1.50
	
Entrada					Saída
3		2						Total: R$ 10.00
2		3						Total: R$ 13.50
*/