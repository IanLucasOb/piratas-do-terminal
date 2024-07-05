package Scripts.Interfaces;

import java.io.IOException;

public class Formatacao {
	private int numEspacamentoUni = 14;
	private String caracteres = "-="; // Mantenha 2 Caracteres
	
	
	public Formatacao () {
		
	}
	
	
	/*
     * MÉTODOS
     */
	public void linha() {
		String msg = "";
		
		for (int i = 0; i < (2*this.numEspacamentoUni + 1); i++) {
			msg += this.caracteres;
		}
		
		System.out.println(msg);
	}
	
	
	public void titulo(String texto) {
		linha();
		centralizar(texto);
		linha();
	}
	


	public void centralizar(String texto) {
		String strEspacamento = "";
		int tamanhoEspacamento = this.numEspacamentoUni * 2 - (texto.length() / 2); // Dobra do Tamanho do Espacamento
		
		for (int i = 0; i < tamanhoEspacamento; i++) {
			strEspacamento += " ";			
		}
		
		System.out.println(strEspacamento + " " +  texto);
	}
	

    // Delay no Terminal de 1 segundo
    public void delay(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
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
    
    
	public void mensagemTerminal(boolean isError, String msg) {
		linha();
    	
		if (isError) {
    		centralizar("[ERRO] - " + msg);
    		
    	} else {
    		centralizar("[INFO] - " + msg);
    		
    	}    	
    	
    	linha();
    }
	
	

}
