package Scripts.Interfaces;


public class Interfaces {
    private boolean batalha;
    private boolean dialogo;
    private boolean navegando;
    private boolean explorando;


    /*
     * CONSTRUTOR
     */
    public Interfaces(boolean batalha, boolean dialogo, boolean navegando, boolean explorando) {
        this.batalha = batalha;
        this.dialogo = dialogo;
        this.navegando = navegando; 
        this.explorando = explorando;
    }

    /*
     * MÉTODOS
     */
    public void linha() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    /*
     * GETTERS E SETTERS 
     */
    public boolean isBatalha() {
        return batalha;
    }
    public void setBatalha(boolean batalha) {
        this.batalha = batalha;
    }


    public boolean isDialogo() {
        return dialogo;
    }
    public void setDialogo(boolean dialogo) {
        this.dialogo = dialogo;
    }


    public boolean isNavegando() {
        return navegando;
    }
    public void setNavegando(boolean navegando) {
        this.navegando = navegando;
    }


    public boolean isExplorando() {
        return explorando;
    }
    public void setExplorando(boolean explorando) {
        this.explorando = explorando;
    }
}