package treino;


import java.util.Scanner;

public class TabuadaAteONum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	int n;
	
	System.out.println("Insira um n�mero");
	n= sc.nextInt();	
	
	
	//FAZ A TABUADA AT� O N�MERO SOLICITADO
	
	for(int x=1;x<=n;x++){
		for(int m=0;m<=10;m++) {
			
			System.out.println(x + " X " + m + " = " + x*m);
			
			
		}
		System.out.println("\n---------------\n");
		
}
       
	

	}

}
