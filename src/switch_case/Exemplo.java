package switch_case;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor inválido";
			break;
		}

		System.out.println("Dia da semana : " + dia);
		sc.close();
	}
}

/*
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
 * seman (sendo 1= domingo, 2 = segunda, e assim por diante). Escrever na tela o
 * dia da seman correspondenre, conforme exemplos.
 * 
 * Entrada: 1 Saída: Dia da semana: domingo Entrada: 4 Saída: Dia da semana:
 * quarta Entrada: 9 Saída: Dia da semana: valor inválido
 * 
 * 
 */
