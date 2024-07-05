package Scripts.Interfaces;

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