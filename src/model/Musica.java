package model;

public class Musica {
	//Atributos
	private String nome;
	private String artistaBanda;
	private String ano;
	
	//Metodo Construtor
	public Musica(String nome, String artistaBanda, String ano) {
		super();
		this.nome = nome;
		this.artistaBanda = artistaBanda;
		this.ano = ano;
	}
	
	//Get e set
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
	
	//Metodo toString
		public String toString() {
		return "Nome: " + this.nome + "\n" + 
				"Artista: " + this.artistaBanda + "\n" + 
				"Ano: " + this.ano + "\n";
		}

		/*Metodo que transforma um cliente na representaçao dele em linha
		  para salvar em um arquivo*/
		public String toLinha(){
			return getNome() + ";" + getArtistaBanda() + ";" + getAno();
		}
	
	

}
