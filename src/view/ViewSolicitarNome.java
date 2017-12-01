package view;

import javax.swing.JOptionPane;

public class ViewSolicitarNome {
	//Atributo
	private String nome;
	
	public ViewSolicitarNome() {
		this.nome = JOptionPane.showInputDialog("Digitar o nome: ");
	}

	public String getNome() {
		return nome;
	}
	

}
