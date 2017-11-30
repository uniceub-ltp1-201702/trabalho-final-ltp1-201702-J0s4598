package control;

import model.BD;
import model.Musica;
import view.ViewCadastraMusica;
import view.ViewExisteMusica;

public class ControleCadastraMusica {
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleCadastraMusica(BD bd) {
		this.bd =bd;
	}
	
	//Metodo para obter dados do artista e gravar no bd
	public void cadastraMusica() {
		//Instanciar a view
		ViewCadastraMusica vcm = new ViewCadastraMusica();
		//Chamar metodo
		vcm.obterDadosMusica();
		
		//Verificar se a musica ja existe
		if (this.bd.existeMusica(vcm.getNome())) {
			//Instaciar a view
			ViewExisteMusica vem = new ViewExisteMusica();
			//Exibir message
			vem.exibirMensadeMusicaExiste();
		}else {
			//Instanciar um objeto classe musica com os dados do bd
			Musica m = new Musica(vcm.getNome(), vcm.getArtistaBanda(), vcm.getAno());
			//Guardar artista no BD
			this.bd.gravarMusicas(m);
			
		}
	}

}
