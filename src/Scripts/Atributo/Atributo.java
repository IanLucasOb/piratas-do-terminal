package Scripts.Atributo;

public class Atributo {
    private String  nome; 
    private double porcetnBonus; 
    private int nivel; 


    /* 
     * CONSTRUTOR
     */
    public Atributo(String nome, double porcetnBonus, int nivel) {
        this.nome = nome;
        this.porcetnBonus = porcetnBonus;
        this.nivel = nivel;
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


    public double getPorcetnBonus() {
        return porcetnBonus;
    }
    public void setPorcetnBonus(double porcetnBonus) {
        this.porcetnBonus = porcetnBonus;
    }


    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
