import java.io.IOException;

import Scripts.Interfaces.*;

public class Testando {
    public static void main(String [] args) throws IOException, InterruptedException {
        Interfaces teste = new Interfaces();
        String ataques[] = {"Ataq", "Ataques 2", "Voadora", "Martelada", "Atirar"};

        teste.opcoesBatalha(ataques);
        // teste.delay();
        
        teste.opcoesBatalhaPadrao();
        // teste.delay();

        teste.creditos();
        // teste.delay();

        teste.menu();
        // teste.delay();
    }
}
