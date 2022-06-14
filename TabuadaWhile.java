package treino;

import java.util.Scanner;


//LAURA XAVIER CHAGAS 1DS

public class TabuadaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num=0, x=1;
		
		 
		
		
		while(true) {
			
			System.out.println("Insira um número:");
			num = sc.nextInt();
			
			x=0;
			
			
		while(x<=10) {
	
		System.out.println(num + " x " + x + " = " +  num*x +"\n");

		x++;
		}    
		
		
		
	
		
		}
			
}
	

}