package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//Atributo
	private String opcao;
	
	//Metodo para exibir lista de opcoes
	public String getOpcao() {
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma op��o\n" + 
				"1 - Cadastra um Artista\n" + 
				"2 - Cadastra uma Musica\n" + 
				"3 - Listar Artista\n" + 
				"4 - Listar Musica\n" + 
				"5 - Sair\n");
		
		return this.opcao;
	}

}
