package Scripts.Pessoa;

import Scripts.Item.*;
import Scripts.Atributo.*;
import Scripts.Bando.*;

public class Player extends Pessoa {
	/*
	 * PROPRIEDADES
	 */
	private Item itemEquipado;
	private Item[] inventario;
	private Atributo[] atributos; // 8 Atributos
	private Atributo atributoPrincipal; 
	private int nivel; 
	private Bando bandoAssociado; 
	private double pesoAtual; // falta
	private double pesoMax; // falta
	private Faccao classePlayer; // falta

	/*
	 * CONSTRUTOR
	 */
	public Player(String nome, String ilhaNatal, int vida, int maxVida, Faccao classePlayer, String nomeBando, String nomeAtributoPrincipal) {
		super(nome, ilhaNatal, vida, maxVida);
		this.inventario = new Item[5];
		this.nivel = 0;
		this.bandoAssociado.setNomeBando(nomeBando);
		this.atributos = new Atributo[8];
		this.atributoPrincipal.setNome(nomeAtributoPrincipal);
		this.classePlayer = classePlayer;
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


	public Atributo[] getAtributos() {
		return atributos;
	}
	public void setAtributos(Atributo[] atributos) {
		this.atributos = atributos;
	}


	public Atributo getAtributoPrincipal() {
		return atributoPrincipal;
	}
	public void setAtributoPrincipal(Atributo atributoPrincipal) {
		this.atributoPrincipal = atributoPrincipal;
	}


	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public Bando getBandoAssociado() {
		return bandoAssociado;
	}
	public void setBandoAssociado(Bando bandoAssociado) {
		this.bandoAssociado = bandoAssociado;
	}


	public double getPesoAtual() {
		return pesoAtual;
	}
	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}


	public double getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}

	
	public Faccao getClassePlayer() {
		return classePlayer;
	}
	public void setClassePlayer(Faccao classePlayer) {
		this.classePlayer = classePlayer;
	}
}
