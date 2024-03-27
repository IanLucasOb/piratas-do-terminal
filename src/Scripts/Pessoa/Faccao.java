package Scripts.Pessoa;

public class Faccao extends Player{
    private String tipo;
    private double bonusAdicional;


    /*
     * CONSTRUTOR
     */
    public Faccao(String nome, String ilhaNatal, int vida, int maxVida, String tipo, double bonusAdicional) {
        super(nome, ilhaNatal, vida, maxVida);
        this.tipo = tipo;
        this.bonusAdicional = bonusAdicional;
    }

    /*
     * MÉTODOS
     */

    /*
    * GETTERS E SETTERS
    */
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double getBonusAdicional() {
        return bonusAdicional;
    }
    public void setBonusAdicional(double bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }
}
