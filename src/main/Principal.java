package main;

import control.ControlPrincipal;
import control.ControleCadastraArtista;
import control.ControleCadastraMusica;
import control.ControleExibirArtista;
import control.ControleExibirMusicas;
import control.ControlePesquisarMusicaArtista;
import control.ControlePesquisarMusicaNome;
import model.BD;

public class Principal {

	public static void main(String[] args) {
	//Instanciar o BD
		/*BD bd = new BD();
		//Carregar os artista do aquivo
		bd.carregarArtistas();
		bd.carregarMusicas();
		//Instanciar ControleArtista
		ControleExibirArtista cea = new ControleExibirArtista(bd);
		//Instanciar ControleCadastraArtista
		ControleCadastraArtista cca = new ControleCadastraArtista(bd);
		//Instanciar ControleMusica
		ControleExibirMusicas cem = new ControleExibirMusicas(bd);
		//Instanciar Cadastra Musica
		ControleCadastraMusica ccm = new ControleCadastraMusica(bd);
		//instanciar PesquisarMusica
		ControlePesquisarMusicaNome cpmn = new ControlePesquisarMusicaNome(bd);
		//Instanciar Pesuisar artista musica
		ControlePesquisarMusicaArtista cpma = new ControlePesquisarMusicaArtista(bd);
		
		//Pesquisar por artista
		cpma.pesquisarMusicaArtistaNome();
		
		//Pesquisar Musica
		cpmn.pesquisarMusicaNome();
		
		//Exibir Artista
		cea.exibirArtistas();
		
		//inseri um novo artista
		cca.cadastraArtistas();
		
		//Exibir Artista
		cea.exibirArtistas();
		
		//Exibir musica
		cem.exibirMusicas();
		
		//Inseri Musica
		ccm.cadastraMusica();
		
		//Exibir musica
		cem.exibirMusicas();*/

			//Criar objeto de ControlePrincipal
		ControlPrincipal cp = new ControlPrincipal();
	}

}
