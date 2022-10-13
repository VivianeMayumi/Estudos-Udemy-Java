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
			dia = "ter�a";
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
			dia = "valor inv�lido";
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
 * Entrada: 1 Sa�da: Dia da semana: domingo Entrada: 4 Sa�da: Dia da semana:
 * quarta Entrada: 9 Sa�da: Dia da semana: valor inv�lido
 * 
 * 
 */
