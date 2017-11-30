package view;

import javax.swing.JOptionPane;

public class ViewCadastraArtista {
	//Atributos
	private String nome;
	private String idade;
	
	//Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	//Metodo para obter dados do Artista a ser inserido
		public void obterDadosArtista(){
			//Obtendo dados do Artista
			this.setNome(JOptionPane.showInputDialog("Informa o nome do Artista: "));
			this.setIdade(JOptionPane.showInputDialog("Informar idade do Artista: "));
		}
}
