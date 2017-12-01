package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	//Atributos
	private ArrayList<Artista> artistas;
	private ArrayList<Musica> musicas;
	private String fileNameA = "artista.txt";
	private String fileNameM = "musica.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	//Metodo construtor
	public BD() {
		//Istanciar o ArrayList
		this.artistas = new ArrayList<Artista>();
		this.musicas = new ArrayList<Musica>();
		//Instanciar o DocumentWriter
		this.dw = new DocumentWriter();
		//Instanciar o DocumenteReader
		this.dr = new DocumentReader();
	}
	/*-----------------------------------------Artista---------------------------------------------------------*/
	/*metodo que carrega todos os Artisat do arquivo
	  para ArrayList*/
	public void carregarArtistas() {
		//Ler as linhas do arquivo
		ArrayList<String> linhas = dr.read(fileNameA);
		//percorrer o ArrayList criando os artistas
		for (int i = 0; i < linhas.size(); i++) {
			//separa a linha em um array de string
			String[] linhaArtistas = linhas.get(i).split(";");
			//Criar o artistas com os dados da linha
			Artista a = new Artista(linhaArtistas[0], Integer.parseInt(linhaArtistas[1]));
			//coloca o artista no ArrayList
			this.artistas.add(a);
		}
	}
	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	//Metodo Gravar artista
	public void gravarArtista(Artista a) {
		//Colocar o cliente no Arraylist
		this.artistas.add(a);
		//Gravar Cliente no arquivo
		dw.write(this.fileNameA, a.toLinha());
	}
	
	//Metodo que verifica se ja existe artista
	public boolean existeArtista(String nome) {
		boolean retorno = false;
		//percore o Arraylist
		for (int i = 0; i < this.artistas.size(); i++) {
			//verificar se existe o artista
			if (this.artistas.get(i).getNome().equals(nome)) {
				retorno = true;
			}
		}
		return retorno;
	}
	/*----------------------------------------------Musica-------------------------------------------------------*/
	/*metodo que carrega todos os Artisat do arquivo
	  para ArrayList*/
	public void carregarMusicas() {
		//Ler as linhas d arquivo
		ArrayList<String> linha = dr.read(fileNameM);
		//Percorrer o ArrayList criando as Musicas
		for (int i = 0; i < linha.size(); i++) {
			//Separa a linha em um arrayList criando os artistas
			String[] linhaMusica = linha.get(i).split(";");
			//Criando a musicas com os dados da linha
			Musica m = new Musica(linhaMusica[0], linhaMusica[1], linhaMusica[2]);
			//Coloca a musica no ArrayList
			this.musicas.add(m);
		}
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	
	//Metodo Gravar Artista
	public void gravarMusicas(Musica m) {
		//Colocar oa musica no ArrayList
		this.musicas.add(m);
		//Gravar Musica no arquivo
		dw.write(this.fileNameM, m.toLinha());
	}
	
	//Metodo que verifique se ja existe musica
	public boolean existeMusica(String nome) {
		boolean retorno = false;
		//percore o Arraylist
		for (int i = 0; i < this.musicas.size(); i++) {
			//verificar se existe o artista
			if (this.musicas.get(i).getNome().equals(nome)) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	//Retornar Musica de acordo com nome
	public Musica getMusicaPorNome(String nome) {
		Musica retorno = null;
		
		//percorrer a lista de musica
		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getNome().equals(nome)) {
				retorno = this.musicas.get(i);
			}
		}
		return retorno;
	}
	
	
	//Retornar Musica de acordo com Artista
		public ArrayList<Musica> musicaArtista(String nome){
			ArrayList<Musica> resultado = new ArrayList<Musica>();
			
			//Percorer a lista de musica
			for (int i = 0; i < this.musicas.size(); i++) {
				if (this.musicas.get(i).getArtistaBanda().equals(nome)) {
					resultado.add(this.musicas.get(i));
				}
			}
			return resultado;
		}
	
	
	
		
}
