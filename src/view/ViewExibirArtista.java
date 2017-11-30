package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Artista;

public class ViewExibirArtista {
	//Merodo para exibir todas as Musica
	public void exibirArtistas(ArrayList<Artista> artistas) {
		//Instanciar String para exibicao
		String todosArtistas = "";
		//Percorrer o ArrayList
		for (int i = 0; i < artistas.size(); i++) {
			todosArtistas = todosArtistas + artistas.get(i).toString() + "\n";
		}
		//Exibir todos os clientes
		JOptionPane.showMessageDialog(null, todosArtistas);
	}

}
