package model;

public class Artista {
	//Atributo
	private String nome;
	private int idade;
	
	//MetodoConstrutor
	public Artista(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	
	//Get e Set	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Metodo toString
	public String toString() {
	return "Nome: " + this.nome + "\n" + 
			"Idade: " + this.idade + "\n";
	}

	/*Metodo que transforma um cliente na representaçao dele em linha
	  para salvar em um arquivo*/
	public String toLinha(){
		return getNome() + ";" + getIdade();
	}

}
