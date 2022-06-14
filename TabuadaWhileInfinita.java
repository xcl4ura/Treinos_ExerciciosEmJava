package treino;

import java.util.Scanner;

public class TabuadaWhileInfinita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num=0, x=1, cont = 1;
		
		 
		
		
		while(cont !=0) {
			
			System.out.println("Insira um número:");
			num = sc.nextInt();
			
			x=0;
			
			
		while(x<=10) {
	
		System.out.println(num + " x " + x + " = " +  num*x +"\n");

		x++;
		}    
		
		System.out.println("Caso queira finalizar o programa, digite 0");
		cont = sc.nextInt();
	
		
		}
	}

}
