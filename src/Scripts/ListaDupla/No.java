package Scripts.ListaDupla;

public class No {
	private Dado info; // o tipo Dado está declarado no capitulo 1
	private No prox;
	private No ant;


	/*
	 * CONSTRUTOR
	 */
	public No (Dado elem){
		this.info = elem;
		this.prox = null;
		this.ant = null;
	}


	/*
	 * GETTERS E SETTERS
	 */
	public Dado getInfo (){
		return this.info;
	}


	public No getProx(){
		return this.prox;
	}
	public void setProx(No novoNo){
		this.prox = novoNo;
	}
	

	public No getAnt(){
		return this.ant;
	}
	public void setAnt(No novoNo){
		this.ant = novoNo;
	}

	/*
	 * MÉTODOS
	 */
}