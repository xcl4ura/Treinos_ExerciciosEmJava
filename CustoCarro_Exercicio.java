package treino;

import java.util.Scanner;

/*10) O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
calcular e escrever o custo final ao consumidor. */

public class CustoCarro_Exercicio {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float custFab;
		double custTot;

		

		System.out.println("Digite o pre�o de f�brica do ve�culo; \n");
		custFab = sc.nextFloat();

		custTot = (custFab * 0.28) + (custFab * 0.45) + custFab;
		
		System.out.println("O custo final do ve�culo �: "+ custTot);
		
		sc.close();
}	

}