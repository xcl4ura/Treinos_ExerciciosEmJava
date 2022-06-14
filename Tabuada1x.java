package treino;

import java.util.Scanner;

public class Tabuada1x {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Insira um número: \n");
		n = sc.nextInt();	
			
		//PARA MOSTRAR A TABUADA DO NUMERO SOLICITADO
			
			
			for(int m=0;m<=10;m++) {
				
				System.out.println(n + " X " + m + " = " + n*m);
				
				
			}
			System.out.println("\n---------------\n");
			
	}
		
	}

