package Scripts.Item;

public class Item {
	
	/*
	 * PROPRIEDADES
	 */
	private String id; 
	private String tipo;

	private String nome; 
	private int quantidade; 
	
	private boolean estacavel; 
	private int quantMax;
	
	private float durabilidadeMax;
	private float durabilidadeAtual;
	
	private float valor;
	private float peso;
	
	/*
	 * CONSTRUTOR
	 */
	public Item(String id, String nome, int quantidade, boolean estacavel, int quantMax, float durabilidadeMax) {
		this.id = id;
		this.nome = nome;
		
		this.quantidade = quantidade;

		this.estacavel = estacavel;
		if (!estacavel)
		{
			this.quantMax = 1;
		}
		else
		{
			this.quantMax = quantMax;
		}

		this.durabilidadeMax = durabilidadeMax;
		this.GerarDurabilidade(false);

	}

	// Construtor simplificado
	public Item(String id, String nome, int quantidade) {
		this.id = id;
		this.nome = nome;
		
		this.quantidade = quantidade;
	}

	/*
	 * MÉTODOS
	 */
	private void GerarDurabilidade(boolean random)
	{
		if (!random)
		{
			this.durabilidadeAtual = this.durabilidadeMax;
		}
		else
		{
			// GERAR ALEATORIAMENTE UM VALOR DE DURABILIDADE
			
		}
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


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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


	public boolean isEstacavel() {
		return estacavel;
	}
	public void setEstacavel(boolean estacavel) {
		this.estacavel = estacavel;
	}


	public int getQuantMax() {
		return quantMax;
	}
	public void setQuantMax(int quantMax) {
		this.quantMax = quantMax;
	}


	public float getDurabilidadeMax() {
		return durabilidadeMax;
	}
	public void setDurabilidadeMax(float durabilidadeMax) {
		this.durabilidadeMax = durabilidadeMax;
	}


	public float getDurabilidadeAtual() {
		return durabilidadeAtual;
	}
	public void setDurabilidadeAtual(float durabilidadeAtual) {
		this.durabilidadeAtual = durabilidadeAtual;
	}


	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}


	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
