package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//Atributo
	private String opcao;
	
	//Metodo para exibir lista de opcoes
	public String getOpcao() {
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma opção\n" + 
				"1 - Cadastra um Artista\n" + 
				"2 - Cadastra uma Musica\n" + 
				"3 - Pesquisar Musica\n" +
				"4 - Pesquisar Musicas de um Artista\n" +
				"5 - Listar Artista\n" + 
				"6 - Listar Musica\n" + 
				"7 - Sair\n");
		
		return this.opcao;
	}

}
