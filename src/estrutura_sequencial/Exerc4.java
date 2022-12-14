package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		double horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salarioFuncionario = horasTrabalhadas* valorHora;
		
		System.out.println("NUMBER: "+ number );
		System.out.printf( "SALARY = U$ %.2f%n ", salarioFuncionario);

		sc.close();
	}
}

/*Fazer um programa que leia o n?mero de um funcion?rio, seu n?mero de horas trabalhadas,
o valor que recebe por hora e calcula o sal?rio desse funcion?rio. A seguir, mostre o n?mero e o 
sal?rio do funcion?rio, com duas casas decimais.
Exemplos:
	Entrada:             Sa?da:
	25                       NUMBER = 25
	100                     SALARY = U$ 550.00
	5.50

	Entrada:             Sa?da:
	1                         NUMBER = 1
	200					   SALARY = U$ 4100.00
	20.50

	Entrada:             Sa?da:
	6                         NUMBER = 6
	145                    SALARY = U$ 2254.75
	15.55
*/
