package view;

import javax.swing.JOptionPane;

import model.Musica;

public class ViewExibirMusicaNome {
	
	public ViewExibirMusicaNome(Musica musica) {
		//Verificar se tem usuario para mostra
		if (musica == null) {
			JOptionPane.showMessageDialog(null, "Musica n�o exise!");
		}else {
			//Exibir com JOptionPane
			JOptionPane.showMessageDialog(null, musica);
		}
	}

}
