package control;

import java.util.ArrayList;

import model.BD;
import model.Musica;
import view.ViewExibirMusica;

public class ControleExibirMusicas {
	//Atributos
	private BD bd;
	private ViewExibirMusica vem;
	
	//Metodo Construtor
	public ControleExibirMusicas(BD bd) {
		this.bd = bd;
		//Instanciar a View
		this.vem = new ViewExibirMusica();
	}
	//Metodo que recupera os artista e exibe
	public void exibirMusicas() {
		//retornar o ArrayList
		ArrayList<Musica> musicas = this.bd.getMusicas();
		//executar o metodo 
		this.vem.exibirMusica(musicas);
	}

}
