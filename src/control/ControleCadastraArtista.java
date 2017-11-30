package control;

import model.Artista;
import model.BD;
import view.ViewCadastraArtista;
import view.ViewExiseArtista;

public class ControleCadastraArtista {
	//Atributos
	private BD bd;
	
	//Metodo construtor
	public ControleCadastraArtista(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para obter dados do artista e gravar no bd
	public void cadastraArtistas() {
		//Instanciar a view
		ViewCadastraArtista vca = new ViewCadastraArtista();
		//Chamar metodo
		vca.obterDadosArtista();
		
		//Verificar se o artista ja existe
		if (this.bd.existeArtista(vca.getNome())) {
			//instanciar a view
			ViewExiseArtista vea = new ViewExiseArtista();
			//exibir message
			vea.exibirMensageArtistaExiste();
		}else {
			//Instanciar um objeto da classe Artista com os dados digitados
			Artista a = new Artista(vca.getNome(), Integer.parseInt(vca.getIdade()));
			//Guardar artista no BD
			this.bd.gravarArtista(a);
		}
	}

}
