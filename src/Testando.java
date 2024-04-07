import java.io.IOException;

import Scripts.Ataque.*;
import Scripts.Atributo.*;
import Scripts.Interfaces.*;
import Scripts.ListaDupla.*;
import Scripts.Pessoa.*;
import java.util.Scanner;

// outro teste
public class Testando {
    public static void main(String [] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        Interfaces teste = new Interfaces();
        
        String funcoes[] = {"Menu", "Menu Padrões", "Menu Defesas", "Menu Ataques", "Créditos"};
        boolean continuar = true;

        do {
            teste.moldeOpcoes("Menu Personalizado", funcoes);
            System.out.print("Digite sua Escolha: ");
            
            int opcoes = input.nextInt();
            teste.linha();

            switch (opcoes) {
                case 1:
                    teste.menu();
                    break;

                case 2:
                    String opcoesPadrao[] = {"Ataque", "Defesa", "Inventário", "Fugir"};
                    teste.moldeOpcoes("Escolhas", opcoesPadrao);

                    break;

                case 3:
                    String defesa[] = {"Esquiva", "Escudo"};
                    teste.moldeOpcoes("Defesas", defesa);
                    
                    break;

                case 4:
                    Player jogador1 = new Player("Thiago", null, 50, (new Faccao("Assassino", 0)), null, "Dano");
                    int cont = 0;
            
                    String ataques[] = {"Ataq", "Ataques 2", "Voadora", "Martelada", "Atirar"};
                    String atributosAtaques[] = {"Dano", "Agilidade", "Dano", "Defesa", "Mira"};
            
                    while (cont != 5) {
                        jogador1.setListaAtaques(new Dado(new Ataque(ataques[cont], new Atributo(atributosAtaques[cont]))));
                        cont++;
                    }
            
                    teste.moldeOpcoes("Ataques", jogador1.getListaAtaques().toSimpleList());
                    break;

                case 5:
                    teste.creditos();
                    break;

                default:
                    continuar = false;
                    break;
            }

            System.out.print("Aperte qualquer tecla para continuar...");
            try {
                System.in.read();
            }  
            catch(Exception e) {}  

            teste.limparTerminal();

        } while (continuar); 
            
        input.close();
    }
}
