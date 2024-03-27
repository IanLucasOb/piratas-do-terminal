package Scripts.Bando;

import Scripts.Pessoa.*;
import Scripts.Atributo.*;

public class Bando {
    private String nomeBando;
    private int qntTripulacao;
    private Player[] tripulacao;
    private Atributo[] bonusTotal;

    /*
     * CONSTRUTOR
     */
    public Bando(String nomeBando, int qntTripulacao, Player[] tripulacao) {
        this.bonusTotal = new Atributo[8];
    }


    /*
     * MÉTODOS
     */


    /*
     * GETTERS E SETTERS
     */
    public String getNomeBando() {
        return nomeBando;
    }
    public void setNomeBando(String nomeBando) {
        this.nomeBando = nomeBando;
    }


    public int getQntTripulacao() {
        return qntTripulacao;
    }
    public void setQntTripulacao(int qntTripulacao) {
        this.qntTripulacao = qntTripulacao;
    }


    public Player[] getTripulacao() {
        return tripulacao;
    }
    public void setTripulacao(Player[] tripulacao) {
        this.tripulacao = tripulacao;
    }


    public Atributo[] getBonusTotal() {
        return bonusTotal;
    }
    public void setBonusTotal(Atributo[] bonusTotal) {
        this.bonusTotal = bonusTotal;
    }
}
