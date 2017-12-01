package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Musica;

public class ViewExibirMusicaArtista {
	
	public ViewExibirMusicaArtista(ArrayList<Musica> m) {
		//Verificar se tem usuario para mostra
		if (m == null) {
			JOptionPane.showMessageDialog(null, "Musica não exise!");
		}else {
			//Exibir com JOptionPane
			JOptionPane.showMessageDialog(null, m);
		}
	}

}
