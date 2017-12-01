package control;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewPrincipal;

public class ControlPrincipal {
	//Atributos
	private BD bd;
	private ViewPrincipal vp;
	private ControleCadastraArtista cca;
	private ControleExibirArtista cea;
	private ControleCadastraMusica ccm;
	private ControleExibirMusicas cem;
	private ControlePesquisarMusicaNome cpmn;
	private ControlePesquisarMusicaArtista cpma;
	
	//Metodo Construtor
	public ControlPrincipal() {
		//Instanciar o Objeto BD
		this.bd = new BD();
		//Instanciar a ViewPrincipal
		this.vp = new ViewPrincipal();
		//Carregar os artista do aquivo
		bd.carregarArtistas();
		bd.carregarMusicas();
		//Criar controle
		this.cca = new ControleCadastraArtista(bd);
		this.cea = new ControleExibirArtista(bd);
		this.ccm = new ControleCadastraMusica(bd);
		this.cem = new ControleExibirMusicas(bd);
		this.cpmn = new ControlePesquisarMusicaNome(bd);
		this.cpma = new ControlePesquisarMusicaArtista(bd);
		
		//Exibir a janela de opcao pela primeira vez
		tratarOpcao(this.vp.getOpcao());
	}
	
	//Metodo para tratar a opcao do usuario
	public void tratarOpcao(String opcao) {
		while(true) {
			switch(opcao) {
			case "1": this.cca.cadastraArtistas();
						break;
			case "2": this.ccm.cadastraMusica();
						break;
			case "3": this.cpmn.pesquisarMusicaNome();
						break;
			case "4": this.cpma.pesquisarMusicaArtistaNome();
						break;
			case "5": this.cea.exibirArtistas();
						break;
			case "6": this.cem.exibirMusicas();
						break;
			case "7": JOptionPane.showMessageDialog(null, "Até breve!");
						return;
			default: JOptionPane.showMessageDialog(null, "Favor digitar opção valida!");
						break;
			}
			
			//Exibir a janela de opcoes
			opcao = this.vp.getOpcao();
		}
	}
	

}
