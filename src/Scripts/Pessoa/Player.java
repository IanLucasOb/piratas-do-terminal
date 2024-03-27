package Scripts.Pessoa;

import Scripts.Item.Item;

public class Player extends Pessoa {
	/*
	 * PROPRIEDADES
	 */
	private Item itemEquipado;
	private Item[] inventario;

	/*
	 * CONSTRUTOR
	 */
	public Player(String nome, String ilhaNatal, int vida, int maxVida) {
		super(nome, ilhaNatal, vida, maxVida);
		this.inventario = new Item[5];
	}


	/*
	 * MÉTODOS
	 */

	/*
	 * GETTERS E SETTERS
	 */
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
