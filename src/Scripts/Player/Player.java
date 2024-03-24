package Scripts.Player;

import Scripts.Item.Item;

public class Player {
	
	/*
	 *  PROPRIEDADES
	 */
	private String nome;
	
	private int vida;
	private int maxVida;

	private double ataque;
	
	private Item[] inventario;
	
	/*
	 * CONSTRUTOR
	 */
	public Player(int maxVida, int ataque)
	{
		this.vida = maxVida;
		this.vida = maxVida;
		this.ataque = ataque;
	}
	
	/*
	 * MÉTODOS
	 */
	
		
	/*
	 *  GETTERS E SETTERS
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMaxVida() {
		return maxVida;
	}

	public void setMaxVida(int maxVida) {
		this.maxVida = maxVida;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public Item[] getInventario() {
		return inventario;
	}

	public void setInventario(Item[] inventario) {
		this.inventario = inventario;
	}
}
