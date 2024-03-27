package Scripts.Item;


public class Armas extends Item {
    private float ataque; 
    private float ataqueCritico; 

    private String categoria; 
    private int alcance;

    private int muniçaoTotal;
    private int muniçãoAtual;


    /*
     * CONSTRUTOR
     */
    public Armas(String id, String nome, int quantidade) {
        super(id, nome, quantidade);
    }

    /*
     * MÉTODOS
     */



    /*
     * GETTERS E SETTERS
     */
    public float getAtaque() {
        return ataque;
    }
    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }


    public float getAtaqueCritico() {
        return ataqueCritico;
    }
    public void setAtaqueCritico(float ataqueCritico) {
        this.ataqueCritico = ataqueCritico;
    }


    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getAlcance() {
        return alcance;
    }
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }


    public int getMuniçaoTotal() {
        return muniçaoTotal;
    }
    public void setMuniçaoTotal(int muniçaoTotal) {
        this.muniçaoTotal = muniçaoTotal;
    }


    public int getMuniçãoAtual() {
        return muniçãoAtual;
    }
    public void setMuniçãoAtual(int muniçãoAtual) {
        this.muniçãoAtual = muniçãoAtual;
    }
}