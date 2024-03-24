package Scripts.Item;

public class Item {
	
	/*
	 * PROPRIEDADES
	 */
	private String id;
	private String nome;
	
	private int quantidade;
	private int quantidadeMax;
	
	private boolean estacavel;
	
	/*
	 * CONSTRUTOR
	 */
	private Item(String id, String nome, int quantidade, int quantidadeMax, boolean estacavel)
	{
		this.id = id;
		this.nome = nome;
		
		this.quantidade = quantidade;
		this.quantidadeMax = quantidadeMax;
		
		this.estacavel = estacavel;
	}

	/*
	 * GETTERS E SETTERS
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeMax() {
		return quantidadeMax;
	}

	public void setQuantidadeMax(int quantidadeMax) {
		this.quantidadeMax = quantidadeMax;
	}

	public boolean isEstacavel() {
		return estacavel;
	}

	public void setEstacavel(boolean estacavel) {
		this.estacavel = estacavel;
	}
}
