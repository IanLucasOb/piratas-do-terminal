package Scripts.Pessoa;

public class Pessoa {
    private String nome;
    private String ilhaNatal;
    private int vida;
	private int maxVida;

    /*
     * CONSTRUTOR
    */
    public Pessoa(String nome, String ilhaNatal, int vida, int maxVida) {
        this.nome = nome;
        this.ilhaNatal = ilhaNatal;
        this.vida = vida; // Não precisa ser passado no método construtor
        this.maxVida = maxVida; // automaticamente será a vida atual quando o personagem for instanciado
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


    public String getIlhaNatal() {
        return ilhaNatal;
    }
    public void setIlhaNatal(String ilhaNatal) {
        this.ilhaNatal = ilhaNatal;
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
}