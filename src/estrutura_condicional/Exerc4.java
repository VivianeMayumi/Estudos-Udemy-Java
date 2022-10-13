package estrutura_condicional;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaInicial - horaFinal;
		} else {
			duracao = 24 - horaInicial +horaFinal;
		}
		System.out.println("O JOGO DUROU: " + duracao +"HORA(S)" );
		sc.close();
	}

}

/*Leia a hora final de um jogo. A seguir calcule a dura��o do jogo,
 *  sabendo que o mesmo pode come�ar em um dia e terminar em outro, 
 *  tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 	
 	Exemplos:
 	*Entrada: 16 2             Sa�da: O JOGO DUROU 10 HORA (S)
 	*Entrada: 0 0               Sa�da: O JOGO DUROU 24 HORA (S)
 	*Entrada: 2 16             Sa�da: O JOGO DUROU 14HORA (S)
 	* */