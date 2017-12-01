package control;

import java.util.ArrayList;

import model.BD;
import model.Musica;
import view.ViewExibirMusicaArtista;
import view.ViewSolicitarNome;

public class ControlePesquisarMusicaArtista {
	//Atributo
	private BD bd;
	
	//Guardar o bd
	public ControlePesquisarMusicaArtista(BD bd) {
		this.bd = bd;
	}
	
	//Metodo que Exibe todos os Usuario
	public void pesquisarMusicaArtistaNome() {
		//Criar View Para solicita o nome
		ViewSolicitarNome vsn = new ViewSolicitarNome();
		//Recuperando o nome digitado pelo usuario
		String nome = vsn.getNome();
		//Retornar dados de de todas musica do  artista de acordo com o nome
		ArrayList<Musica> m = bd.musicaArtista(nome);
		
		//Exibir os dados das musicas
		ViewExibirMusicaArtista vema = new ViewExibirMusicaArtista(m);
	}
}
