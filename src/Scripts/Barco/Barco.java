package Scripts.Barco;

import Scripts.Item.Item;
import Scripts.Ilha.Ilha;

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

	private Ilha ilhaAtracada;

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
	 * MÉTODOS
	 */
	public void TakeDamage(float damage)
	{
		// Tomar dano baseado no ataque feito
		durabilidadeAtual -= damage;

		// Verificar se o barco foi destruido
		if (durabilidadeAtual <= 0)
		{
			
		}
	}

	public void IrAltoMar()
	{
		// Alternar a ilha atracada para nula
		this.setIlhaAtracada(null);
	}

	public void MoverBarco(Ilha novaIlha)
	{
		
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

	public Ilha getIlhaAtracada() {
		return ilhaAtracada;
	}

	public void setIlhaAtracada(Ilha ilhaAtracada) {
		this.ilhaAtracada = ilhaAtracada;
	}
}
