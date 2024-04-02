import java.io.IOException;

import Scripts.Ataque.*;
import Scripts.Atributo.*;
import Scripts.Interfaces.*;
import Scripts.Pessoa.*;
import Scripts.ListaSimples.*;

public class Testando {
    public static void main(String [] args) throws IOException, InterruptedException {
        Interfaces teste = new Interfaces();
        Player jogador1 = new Player("Thiago", "None", 50, (new Faccao("Velocidade", 0)), "None", "Dano");

        String ataques[] = {"Ataq", "Ataques 2", "Voadora", "Martelada", "Atirar"};
        String atributosAtaques[] = {"Dano", "Agilidade", "Dano", "Defesa", "Mira"};
        
        int cont = 0;
        while (cont != 5) {
            jogador1.setListaAtaques(new Dado(new Ataque(ataques[cont], new Atributo(atributosAtaques[cont]))));
            cont++;
        }

        jogador1.getListaAtaques().toString();

        teste.opcoesBatalha(jogador1.getListaAtaques());
        // teste.delay();
        
        teste.opcoesBatalhaPadrao();
        // teste.delay();

        teste.creditos();
        // teste.delay();

        teste.menu();
        // teste.delay();
    }
}
