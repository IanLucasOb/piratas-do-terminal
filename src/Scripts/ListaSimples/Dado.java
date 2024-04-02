package Scripts.ListaSimples;

import Scripts.Ataque.Ataque;

public class Dado {
	private int chave;
	private Ataque ataque;
	// aqui podem ser declarados outros atributos conforme sua necessidade.
	
	//Construtor de objetos da classe Item
	public Dado(int ch) {
		this.chave = ch;
	}

	//Modifica o valor do atributo chave
	public void setChave (int ch){
		this.chave = ch;
	}
	//Faz a leitura do valor do atributo chave
	public int getChave (){
		return this.chave;
	}

	/*
	 * Ataque
	 */
	public void setChave (Ataque ataque){
		this.ataque = ataque;
	}
	public Dado(Ataque ataque) {
		this.ataque = ataque;
	}
	public Ataque getAtaque (){
		return this.ataque;
	}
}