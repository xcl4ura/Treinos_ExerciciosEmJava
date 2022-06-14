package treino;

import java.util.Scanner;

public class MediaArit_Exercicio {

public static void main(String[]args) {
		

		
		int mediaf, m1, m2, m3, n1, n2, n3;
		String nomeAlun;
		
		Scanner algoritmo = new Scanner(System.in);
		
		System.out.println("\nInsira o nome do aluno(a): ");
		nomeAlun = algoritmo.next();
		
		System.out.println("\nInsira a primeira nota: ");
		n1 = algoritmo.nextInt();
		
		
		System.out.println("\nInsira a segunda nota: ");
		n2 = algoritmo.nextInt();
		
		
		System.out.println("\nInsira a terceira nota: ");
		n3 = algoritmo.nextInt();
		
		m1= n1*2;
		m2 = n2*3;
		m3 = n3*5;
	
		
		mediaf = (m1+m2+m3)/10;
		
		System.out.println("\nA média final do(a) aluno(a) "+ nomeAlun+ " é: "+ mediaf);
		
		algoritmo.close();
	}
  }