package treino;

import java.util.Scanner;

public class Tabuada3X {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//PARA REPETIR O NUMERO SOLICITADO 3X 
		int n;
		
		
		System.out.println("Insira um número: \n");
		n = sc.nextInt();
		
		
		for(int r=1;r<=3;r++){
			
			for(int m=0;m<=10;m++) {
				
				System.out.println(n + " X " + m + " = " + n*m);	
			}
			System.out.println("\n---------------\n");
		}
			

	}

}
