package treino;

import java.util.Scanner;

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor. */

public class SalarioFinal_Exercicio {

	public static void main(String[]args) {
		
		Scanner respostas = new Scanner(System.in);
	
		int carrosVend,valorCarro;
		double salarioF,comissaoF,valorTcomissao, valorTvenda,valorTporcentagem,salarioFinal,porcentadic=0.05;
		
		System.out.println("Insira a quantidade de carros vendidos: ");
		carrosVend = respostas.nextInt();
		
		System.out.println("Insira o salário fixo: ");
		salarioF = respostas.nextDouble();
		
		System.out.println("Insista a comissão fixa por carro vendido: ");
		comissaoF = respostas.nextDouble();
		
		
		System.out.println("Insira o valor do carro vendido: ");
		valorCarro = respostas.nextInt();
		

		
		valorTporcentagem = porcentadic*valorCarro;
		valorTcomissao = comissaoF*carrosVend;
		valorTvenda = valorTporcentagem*carrosVend;
		salarioFinal = valorTcomissao+valorTvenda+salarioF;
			
	
	    System.out.println("O número de carros vendidos é: "+carrosVend+"\n");
	    
	    System.out.println("O valor total de suas vendas é:"+valorTvenda+"\n");

	    System.out.println("O salário fixo do vendedor é: "+salarioF+"\n");
	    
	    System.out.println("O valor recebido pelos carros vendidos é: "+valorTcomissao+"\n");
	    
	    System.out.println("O salário final do vendedor é: "+salarioFinal+"\n");
	    
	    
	    respostas.close();
}	
}