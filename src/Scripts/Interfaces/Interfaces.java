package Scripts.Interfaces;

import java.io.IOException;
import Scripts.Ataque.*;
import Scripts.ListaSimples.ListaSimples;
import Scripts.ListaSimples.No;

public class Interfaces {
    private boolean batalha = false;
    private boolean dialogo = false;
    private boolean navegando = false;
    private boolean explorando = false;


    /*
     * CONSTRUTOR
     */
    public Interfaces() {
    }

    /*
     * MÉTODOS
     */
    public void linha() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void centralizaTexto(String msg) {
        int tamanhoMsg = msg.length();
        int inicio = (57 / 2) - (tamanhoMsg / 2);

        for (int i = 0; i < inicio; i++) {
            System.out.print(" ");
        }
        System.out.print(msg + "\n");
    }


    public String centralizaTexto(int tamanahoEspaco, String msg, boolean quebraLinha, boolean printarMsg) {
        int tamanhoMsg = msg.length();
        int inicio = (57/2 - tamanahoEspaco) - (tamanhoMsg / 2) + 3;
        String textoFinal = "";

        if (printarMsg) {
            for (int i = 0; i < inicio; i++) {
                System.out.print(" ");
            }
    
            if (quebraLinha) {
                System.out.print(msg + "\n");
            }

        } else {
            for (int i = 0; i < inicio; i++) {
                textoFinal += " ";
            }
            textoFinal += msg;

        }   

        return textoFinal;
    }


    public void titulo(String msg) {
        this.linha();
        this.centralizaTexto(msg);
        this.linha();
    }


    public void menu() {
        this.titulo("Menu");
        System.out.println(   "  [ 0 ] - Sair" 
                            + "\n  [ 1 ] - Jogar"
                            + "\n  [ 2 ] - Opções"
                            + "\n  [ 3 ] - Créditos");
        this.linha();
    }


    public void creditos() {
        System.out.println(   "Créditos:");

        centralizaTexto("Ian Lucas Oliveira Bastos");
        centralizaTexto("João Augusto Tolentino Santana");
        centralizaTexto("Thiago Holz Coutinho");

        System.out.println("                                             © ILUSES 2024");
        this.linha();
    }


    public void opcoesBatalha(ListaSimples listaAtaques){
        int cont = 0;
        No atual = listaAtaques.getPrim();

        String[] text = new String[listaAtaques.getQuantNos()];

        this.titulo("Ataques");
        for (int i = 0; atual != null; i++) {
            cont++;
            text[i] = "[ " + (i + 1) + " ] - " + atual.getInfo().getAtaque().getNome();
            
            if (cont == 2) {
                System.out.println(text[i - 1]
                                    + this.centralizaTexto(text[i - 1].length(), "|       ", true, false) 
                                    + text[i]);
                cont = 0;
            }
            atual = atual.getProx();
        }

        this.linha();
    }


    public void opcoesBatalhaPadrao() {
        this.titulo("Escolhas");
        System.out.println(   "  [ 1 ] - Ataque           |       [ 2 ] - Defesa" +
                            "\n  [ 3 ] - Iventário        |       [ 4 ] - Fugir");
        this.linha();
    }


    public void delay() {
        try {
            // Tempo de 1 segundo;
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Limpa o terminal, ainda em teste - Thiago
    public void limparTerminal() throws IOException, InterruptedException {
        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear"); // Resto do código, porém o VS estava reclamando
        }
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