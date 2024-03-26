package Scripts.Player;

import Scripts.Item.Item;

public class Player {

	/*
	 * PROPRIEDADES
	 */
	private String nome;

	private int vida;
	private int maxVida;

	private Item itemEquipado;

	private Item[] inventario;

	/*
	 * CONSTRUTOR
	 */
	public Player(String nome, int maxVida) {
		this.vida = maxVida;
		this.vida = maxVida;
		this.nome = nome;
	}

	/*
	 * MÉTODOS
	 */

	/*
	 * GETTERS E SETTERS
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

	public Item getItemEquipado() {
		return itemEquipado;
	}

	public void setItemEquipado(Item itemEquipado) {
		this.itemEquipado = itemEquipado;
	}

	public Item[] getInventario() {
		return inventario;
	}

	public void setInventario(Item[] inventario) {
		this.inventario = inventario;
	}
}
