package treino;

import java.util.Scanner;

/*Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
		contr�rio escrever N�O � MAIOR QUE 10! */

public class MaiorQue10_Exercicio {
	
public static void main(String[]args) {
		
		Scanner algoritmo = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Insira um n�mero: ");
		valor = algoritmo.nextInt();
			
		if (valor > 10) {
			System.out.println("O valor � maior que 10! \n");
			
		}
		
		else if (valor==10) {
			System.out.println("� IGUAL A 10!\n\n");
			
		}
		else {
			System.out.println("\nO valor n�o � maior que 10!! ");			
			
		}
		
		algoritmo.close();
	}
	
}