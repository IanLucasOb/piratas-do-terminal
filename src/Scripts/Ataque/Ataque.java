package Scripts.Ataque;

import Scripts.Atributo.Atributo;

public class Ataque {
    private String nome;
    private int dano;

    private Atributo atributoRelacion;

    /*
     * CONSTRUTOR
     */
    public Ataque(String nome, int dano, Atributo atributo) {
        this.nome = nome;
        this.dano = dano;
        this.atributoRelacion = atributo;
    }


    /*
     * GETTERS E SETTERS
     */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }


    public Atributo getAtributoRelacion() {
        return atributoRelacion;
    }
    public void setAtributoRelacion(Atributo atributoRelacion) {
        this.atributoRelacion = atributoRelacion;
    }
}
