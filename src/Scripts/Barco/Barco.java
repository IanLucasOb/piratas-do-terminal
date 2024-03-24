package Scripts.Barco;

import Scripts.Item.Item;

public class Barco {
	
	/*
	 * PROPRIEDADES
	 */
	private String tipo;
	private int velocidade;
	
	private Item[] carga;
	private int limiteCarga;
	
	private float durabilidadeAtual;
	private float durabilidadeMax;

	/*
	 * CONSTRUTOR
	 */
	public Barco(String tipo, int velocidade, int limiteCarga, float durabilidadeMax)
	{
		this.tipo = tipo;
		this.velocidade = velocidade;
		
		this.carga = new Item[limiteCarga];
		this.limiteCarga = limiteCarga;

		this.durabilidadeAtual = durabilidadeMax;
		this.durabilidadeMax = durabilidadeMax;
	}

	/*
	 * GETTERS E SETTERS
	 */
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Item[] getCarga() {
		return carga;
	}

	public void setCarga(Item[] carga) {
		this.carga = carga;
	}

	public int getLimiteCarga() {
		return limiteCarga;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}

	public float getDurabilidadeAtual() {
		return durabilidadeAtual;
	}

	public void setDurabilidadeAtual(float durabilidadeAtual) {
		this.durabilidadeAtual = durabilidadeAtual;
	}

	public float getDurabilidadeMax() {
		return durabilidadeMax;
	}

	public void setDurabilidadeMax(float durabilidadeMax) {
		this.durabilidadeMax = durabilidadeMax;
	}	
}
