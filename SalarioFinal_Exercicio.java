package treino;

import java.util.Scanner;

/*Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
vendedor. */

public class SalarioFinal_Exercicio {

	public static void main(String[]args) {
		
		Scanner respostas = new Scanner(System.in);
	
		int carrosVend,valorCarro;
		double salarioF,comissaoF,valorTcomissao, valorTvenda,valorTporcentagem,salarioFinal,porcentadic=0.05;
		
		System.out.println("Insira a quantidade de carros vendidos: ");
		carrosVend = respostas.nextInt();
		
		System.out.println("Insira o sal�rio fixo: ");
		salarioF = respostas.nextDouble();
		
		System.out.println("Insista a comiss�o fixa por carro vendido: ");
		comissaoF = respostas.nextDouble();
		
		
		System.out.println("Insira o valor do carro vendido: ");
		valorCarro = respostas.nextInt();
		

		
		valorTporcentagem = porcentadic*valorCarro;
		valorTcomissao = comissaoF*carrosVend;
		valorTvenda = valorTporcentagem*carrosVend;
		salarioFinal = valorTcomissao+valorTvenda+salarioF;
			
	
	    System.out.println("O n�mero de carros vendidos �: "+carrosVend+"\n");
	    
	    System.out.println("O valor total de suas vendas �:"+valorTvenda+"\n");

	    System.out.println("O sal�rio fixo do vendedor �: "+salarioF+"\n");
	    
	    System.out.println("O valor recebido pelos carros vendidos �: "+valorTcomissao+"\n");
	    
	    System.out.println("O sal�rio final do vendedor �: "+salarioFinal+"\n");
	    
	    
	    respostas.close();
}	
}