package treino;

import java.util.Scanner;

/*10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. */

public class CustoCarro_Exercicio {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		float custFab;
		double custTot;

		

		System.out.println("Digite o preço de fábrica do veículo; \n");
		custFab = sc.nextFloat();

		custTot = (custFab * 0.28) + (custFab * 0.45) + custFab;
		
		System.out.println("O custo final do veículo é: "+ custTot);
		
		sc.close();
}	

}