package dojo;

import javax.swing.JOptionPane;

public class RevisaoDecisaoo {

	public static void main(String[] args) {
		int numInt;
		float numFloat;
		String nome;
		
		
		
		nome = JOptionPane.showInputDialog(null, "Digite seu nome", 
				"ENTRADA", JOptionPane.QUESTION_MESSAGE);
		
		
		numInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro", 
				"ENTRADA", JOptionPane.QUESTION_MESSAGE));
		
		numFloat = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número real", 
				"ENTRADA", JOptionPane.QUESTION_MESSAGE));
		
		
		
		
		JOptionPane.showMessageDialog(null, "Usuário: " + nome, 
				"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		
		if (numInt>0) {
			JOptionPane.showMessageDialog(null, "O número inteiro é POSITIVO", 
					"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		}
		if (numInt<0) {
			JOptionPane.showMessageDialog(null, "O número inteiro é NEGATIVO", 
					"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		}
		if (numInt==0) {
			JOptionPane.showMessageDialog(null, "O número inteiro é ZERO", 
					"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (numFloat>0) {
			JOptionPane.showMessageDialog(null, "O número real é POSITIVO", 
					"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		} else if (numFloat<0) {
			JOptionPane.showMessageDialog(null, "O número real é NEGATIVO", 
					"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O número real é ZERO", 
					"SAÍDA", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
