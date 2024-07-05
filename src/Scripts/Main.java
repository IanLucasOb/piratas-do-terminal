package Scripts;

import java.io.IOException;

import Scripts.Interfaces.Creditos;
import Scripts.Interfaces.Formatacao;

// outro teste
public class Main {
    public static void main(String [] args) throws IOException, InterruptedException {
        Creditos menuCreditos = new Creditos();
        Formatacao format = new Formatacao();
        
        int foda = 3;
        boolean continuar = true;

        do {
        	// com erro
            // int foda = teste.menu();

            switch (foda)
            {
                case 0:

                    // Finalizar Scanners
                	// com erro
                    // teste.Finalizar();

                    // Finalizar continuação do programa
                    continuar = false;

                    break;
                
                case 2:

                    break;

                case 3:
                    
                    // Mostrar créditos
                    menuCreditos.creditos();

                    break;
            }

            // Limpar tela do terminal
            format.limparTerminal();

        } while (continuar);
    }
}