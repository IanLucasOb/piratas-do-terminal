package Scripts.ListaSimples;

public class No {
	private Dado info; // a declara��o do tipo Dado est� no capitulo 1
	private No prox;

	public No (Dado elem){  // a vari�vel elem cont�m os dado que ser�o armazenados
		this.info = elem;
		this.prox = null; // esta linha � opcional, pois o prox � automaticamente 
//definido como null
	}
	public Dado getInfo (){
		return this.info;
	}
	public void setInfo(Dado elem){
		this.info = elem;
	}
	public No getProx(){
		return this.prox;
	}
	public void setProx(No novoNo){
		this.prox = novoNo;
	}

}