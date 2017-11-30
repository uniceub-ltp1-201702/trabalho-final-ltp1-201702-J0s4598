package view;

import javax.swing.JOptionPane;

public class ViewCadastraMusica {
	//Atributo
	private String nome;
	private String artistaBanda;
	private String ano;
	
	//Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArtistaBanda() {
		return artistaBanda;
	}
	public void setArtistaBanda(String artistaBanda) {
		this.artistaBanda = artistaBanda;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	//Metodo para obter dados da Musica a ser inserido
	public void obterDadosMusica() {
		//Obtendo dados da Musica
		this.setNome(JOptionPane.showInputDialog("Informar nome da Musica: "));
		this.setArtistaBanda(JOptionPane.showInputDialog("Informar nome do Artista da Musica: "));
		this.setAno(JOptionPane.showInputDialog("Informar ano de lancamento: "));
	}
}
