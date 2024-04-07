import java.io.IOException;

import Scripts.Ataque.*;
import Scripts.Atributo.*;
import Scripts.Interfaces.*;
import Scripts.ListaDupla.*;
import Scripts.Pessoa.*;

// outro teste
public class Testando {
    public static void main(String [] args) throws IOException, InterruptedException {
        Interfaces teste = new Interfaces();
        
        boolean continuar = true;

        do {
            int foda = teste.menu();

            switch (foda)
            {
                case 0:

                    // Finalizar Scanners
                    teste.Finalizar();

                    // Finalizar continuação do programa
                    continuar = false;

                    break;
                
                case 2:

                    break;

                case 3:
                    
                    // Mostrar créditos
                    teste.creditos();

                    break;
            }

            // Limpar tela do terminal
            teste.limparTerminal();

        } while (continuar);
    }
}