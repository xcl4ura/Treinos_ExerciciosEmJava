package dojo;

import javax.swing.JOptionPane;

public class RevisaoDecisaoo {

	public static void main(String[] args) {
		int numInt;
		float numFloat;
		String nome;
		
		
		
		nome = JOptionPane.showInputDialog(null, "Digite seu nome", 
				"ENTRADA", JOptionPane.QUESTION_MESSAGE);
		
		
		numInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro", 
				"ENTRADA", JOptionPane.QUESTION_MESSAGE));
		
		numFloat = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um n�mero real", 
				"ENTRADA", JOptionPane.QUESTION_MESSAGE));
		
		
		
		
		JOptionPane.showMessageDialog(null, "Usu�rio: " + nome, 
				"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		
		if (numInt>0) {
			JOptionPane.showMessageDialog(null, "O n�mero inteiro � POSITIVO", 
					"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		}
		if (numInt<0) {
			JOptionPane.showMessageDialog(null, "O n�mero inteiro � NEGATIVO", 
					"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		}
		if (numInt==0) {
			JOptionPane.showMessageDialog(null, "O n�mero inteiro � ZERO", 
					"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (numFloat>0) {
			JOptionPane.showMessageDialog(null, "O n�mero real � POSITIVO", 
					"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		} else if (numFloat<0) {
			JOptionPane.showMessageDialog(null, "O n�mero real � NEGATIVO", 
					"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero real � ZERO", 
					"SA�DA", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
