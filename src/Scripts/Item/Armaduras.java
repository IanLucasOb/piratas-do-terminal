package Scripts.Item;

public class Armaduras extends Item {
    private float defesa;
    private String conjuno;
    
    private float bonusConjunto;


    /*
     * CONSTRUTOR
     */
    public Armaduras(String id, String nome, int quantidade) {
        super(id, nome, quantidade);
    }


    /*
     * GETTERS E SETTERS
     */
    public float getDefesa() {
        return defesa;
    }
    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }


    public String getConjuno() {
        return conjuno;
    }
    public void setConjuno(String conjuno) {
        this.conjuno = conjuno;
    }


    public float getBonusConjunto() {
        return bonusConjunto;
    }
    public void setBonusConjunto(float bonusConjunto) {
        this.bonusConjunto = bonusConjunto;
    }
}
