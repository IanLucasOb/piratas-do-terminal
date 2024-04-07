package Scripts.Interfaces;

import java.io.IOException;
import java.util.Scanner;


public class Interfaces {
    private boolean batalha = false;
    private boolean dialogo = false;
    private boolean navegando = false;
    private boolean explorando = false;

    // Criar Scanner
    Scanner input;

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


    // Centraliza o Texto com um tamanho padrão
    public void centralizaTexto(String msg) {
        int tamanhoMsg = msg.length();
        int inicio = (57 / 2) - (tamanhoMsg / 2);

        for (int i = 0; i < inicio; i++) {
            System.out.print(" ");
        }
        System.out.print(msg + "\n");
    }


    // Centraliza o texto de acordo com o argumentos passados
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


    // Faz uma formatação do título como um cabeçalho
    public void titulo(String msg) {
        this.linha();
        this.centralizaTexto(msg);
        this.linha();
    }


    // Printa o menu
    public int menu() {
        this.titulo("Menu");
        System.out.println(   "  [ 0 ] - Sair" 
                            + "\n  [ 1 ] - Jogar"
                            + "\n  [ 2 ] - Opções"
                            + "\n  [ 3 ] - Créditos");
        this.linha();

        return this.InputTeclado(0, 3, ">>> ");
    }


    // Printa os Créditos do Jogo
    public void creditos() throws IOException, InterruptedException {

        // Antes de imprimir os créditos, limpar o terminal
        this.limparTerminal();

        /*
         * Imprimir os créditos
         */
        System.out.println(   "Créditos:");

        centralizaTexto("Ian Lucas Oliveira Bastos");
        centralizaTexto("João Augusto Tolentino Santana");
        centralizaTexto("Thiago Holz Coutinho");

        System.out.println("                                             \u00A9 ILUSES 2024");
        this.linha();

        // Indicar o jogador a pressionar RETURN para voltar
        System.out.println("Pressione ENTER para voltar...");

        // Manter o terminal aparecendo até o jogador pressionar RETURN
        try 
        {
            System.in.read();
        }  
        catch(Exception e) {}  
    }


    // Código recursivo para opções
    public void moldeOpcoes(String nome, String[] lista){
        int cont = 0;
        String[] text = new String[lista.length];

        this.titulo(nome);
        for (int i = 0; i < lista.length; i++) {
            cont++;
            text[i] = "[ " + (i + 1) + " ] - " + lista[i];
            
            if (cont == 2) {
                System.out.println(text[i - 1]
                                    + this.centralizaTexto(text[i - 1].length(), "|       ", true, false) 
                                    + text[i]);
                cont = 0;
            } 

            if (i == lista.length - 1) {
                System.out.println(text[i]);
            }
        }
        this.linha();
    }


    // Delay no Terminal de 1 segundo
    public void delay() {
        try {
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
            Runtime.getRuntime(); //.exec("clear"); // Resto do código, porém o VS estava reclamando
        }
    }

    // Utiliza dados de input do teclado
    
    // Pegar um número inteiro dentro de um limite especificado
    public int InputTeclado(int min, int max, String descricao)
    { 
        // Solicitar o teclado enquanto a resposta não estiver correta
        int resposta;
        do
        {
            // Instanciar um novo Scanner
            this.input = new Scanner(System.in);

            try 
            {
                // Mostrar Descrição/Titulo antes de solicitar o teclado
                System.out.print(descricao);
                
                // Pegar input do teclado para a resposta
                resposta = this.input.nextInt();
            }
            catch (java.util.InputMismatchException error)
            {
                // Forçar um valor inválido
                resposta = min - 1;
            }

        } while (resposta < min || resposta > max);
        
        // Retorna a resposta inserida
        return resposta;
    }

    // Pegar um texto do teclado
    /* TODO - TERMINAR
    public String InputTeclado(int length)
    {

    }
    */

    // Finalizar os inputs
    public void Finalizar()
    {
        // Desligar scanner
        input.close();
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