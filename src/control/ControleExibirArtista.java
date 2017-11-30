package control;

import java.util.ArrayList;

import model.Artista;
import model.BD;
import view.ViewExibirArtista;

public class ControleExibirArtista {
	//Atributos
	private BD bd;
	private ViewExibirArtista vea;
	
	//Metodo Construtor
	public ControleExibirArtista(BD bd) {
		this.bd = bd;
		//Instanciar a View
		this.vea = new ViewExibirArtista();
	}
	//Metodo que recupere os artista e exibe
	public void exibirArtistas() {
		//retornar o arrayList
		ArrayList<Artista> artistas = this.bd.getArtistas();
		//Executar o metodo
		this.vea.exibirArtistas(artistas);
	}
	
}
