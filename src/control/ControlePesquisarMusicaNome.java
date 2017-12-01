package control;

import model.BD;
import model.Musica;
import view.ViewExibirMusicaNome;
import view.ViewSolicitarNome;

public class ControlePesquisarMusicaNome {
	//Atributos
	private BD bd;
	
	//Guardar o bd
	public ControlePesquisarMusicaNome(BD bd) {
		this.bd = bd;
	}
	
	//Metodo que Exibe todos os Usuario
	public void pesquisarMusicaNome() {
		//Criar View Para solicita o nome
		ViewSolicitarNome vsn = new ViewSolicitarNome();
		//Recuperando o nome digitado pelo usuario
		String nome = vsn.getNome();
		//Retornar dados de musica de acordo com o nome
		Musica m = bd.getMusicaPorNome(nome);
		//Exibir os dados da musica
		ViewExibirMusicaNome vemn = new ViewExibirMusicaNome(m);
	}

}
