package dojo;

import javax.swing.JOptionPane;

//PRIMEIRO CODIGO COM JOP- DOJO EM SALA

public class Dojo1 {

	public static void main(String[] args) {
		
		String name,email,rg,cpf;
		
		name = JOptionPane.showInputDialog(null, "Insira seu nome completo: \n", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
		
		email = JOptionPane.showInputDialog(null, "Insira seu email: \n", "CADASTRO", JOptionPane.QUESTION_MESSAGE);

		rg = JOptionPane.showInputDialog(null,"Insira seu RG: \n", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
		
		cpf = JOptionPane.showInputDialog(null,"Insira seu CPF: \n", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
		
		
		JOptionPane.showMessageDialog(null, "Nome: "+ name + "\n" + "Email: " + email + "\n" + "RG: " + rg + "\n" + 
		"CPF: " + cpf, "CONFIRMAR CADASTRO", JOptionPane.INFORMATION_MESSAGE);
	
		
		JOptionPane.showMessageDialog(null, "Confirmar pedido?", "CONFIRMAR CADASTRO", JOptionPane.INFORMATION_MESSAGE);
	
	}

}
