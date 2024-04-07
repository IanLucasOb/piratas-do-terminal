package Scripts.ListaDupla;

public class ListaDupla {
	private No prim;
	private No ult;
	private int quantNos;


	/*
	 * CONSTRUTOR
	 */
	public ListaDupla(){
		this.prim = null;
		this.ult = null;
		this.quantNos = 0;
	}


	/*
	 * GETTERS E SETTERS
	 */
	public int getQuantNos(){
		return this.quantNos;
	}
	public void setQuantNos(int valorNovo){
		this.quantNos = valorNovo;
	}


	public No getPrim(){
		return this.prim;
	}
	public void setPrim(No novoNo){
		this.prim = novoNo;
	}


	public No getUlt(){
		return this.ult;
	}
	public void setUlt(No novoNo){
	this.ult = novoNo;
	}
	

	/*
	 * Métodos
	 */
	public boolean eVazia (){
		return (this.prim == null);
	}

	//insere um novo nó no final da lista ou se a lista estiver vazia, insere
	// o primeiro nó na lista
	public void inserirUltimo (Dado elem){
		No novoNo = new No (elem);
		if (this.eVazia())
			this.prim = novoNo;
		else {
			novoNo.setAnt(this.ult);
			this.ult.setProx(novoNo);
		}
		this.ult = novoNo;
		this.quantNos++;
	}


	//retorna o endereço do nó que está contendo o valor a ser procurado.
	public No pesquisarNo (int chave){
		No atual = this.prim;
		while ((atual != null) && (atual.getInfo().getChave() != chave))
			atual = atual.getProx();
			return atual;
	}


	//remove um determinado nó em qualquer posição na lista.
	public boolean removerNo (int chave){
		No atual = this.prim;
		while ((atual != null) && (atual.getInfo().getChave()!= chave)){
			atual = atual.getProx();
		}

		if (atual == null)
			return false;

		else
			if (atual == this.prim){
				this.prim = prim.getProx();
				
				if (this.prim == null) //se a lista tem somente um nó
					this.ult=null;
				
				else
					this.prim.setAnt(null);
			}
			else
				if (atual == this.ult){
					this.ult = this.ult.getAnt();
					this.ult.setProx(null);
				} else {
					atual.getProx().setAnt(atual.getAnt());
					atual.getAnt().setProx(atual.getProx());
				}
		this.quantNos--;
		return true;
	}


	public String toString(){
		String msg="";
		No atual = this.prim;
		while (atual != null){
			msg += atual.getInfo().getChave() + " ";
			atual = atual.getProx();
		}
		return msg;
	}



	public String[] toSimpleList(){
		String msg[] = new String[this.getQuantNos()];
		No atual = this.prim;

		for (int i = 0; atual != null; i++){
			msg[i] = atual.getInfo().getAtaque().getNome();
			atual = atual.getProx();
		}

		return msg;
	}
}