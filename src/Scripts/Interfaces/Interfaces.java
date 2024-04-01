package Scripts.Interfaces;


public class Interfaces {
    private boolean batalha = false;
    private boolean dialogo = false;
    private boolean navegando = false;
    private boolean explorando = false;


    /*
     * CONSTRUTOR
     */
    public Interfaces() {
        this.menu();
    }

    /*
     * MÉTODOS
     */
    public void linha() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void menu() {
        this.linha();
        System.out.println("                         Menu");
        this.linha();
        System.out.println(   "  [ 0 ] - Sair" 
                            + "\n  [ 1 ] - Jogar"
                            + "\n  [ 2 ] - Opções"
                            + "\n  [ 3 ] - Créditos");
        this.linha();
    }

    public void creditos() {
        System.out.println(   "Créditos: "
                            + "\n            Ian Lucas Oliveira Bastos"
                            + "\n         João Augusto Tolentino Santana"
                            + "\n              Thiago Holz Coutinho"
                            + "\n                                             © ILUSES 2024");
        this.linha();
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