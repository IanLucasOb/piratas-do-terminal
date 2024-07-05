package Scripts.Interfaces;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Creditos {
	public static Formatacao format = new Formatacao();
	public static Scanner entrada = new Scanner(System.in);

	
	public void creditos () throws IOException, InterruptedException {
		char abrirNav;
		String strAbrirNav;
		
		format.titulo("Créditos");

		format.centralizar("Ian Lucas Oliveira Bastos");
		format.centralizar("João Augusto Tolentino Santana");
		format.centralizar("Thiago Holz Coutinho");
		
		System.out.println("\n© Copyright ILUSES 2024"
				+ "\n"
				+ "\nLink do GitHub do Projeto:");
		format.centralizar("- https://github.com/IanLucasOb/piratas-do-terminal");
		format.linha(); 

		System.out.print("Abrir Link no navegador? [S/N] ");
		abrirNav = entrada.next().toUpperCase().charAt(0);
		strAbrirNav = Character.toString(abrirNav).toUpperCase();


		if (strAbrirNav.equals("S") || strAbrirNav.equals("N")) {
			if (strAbrirNav.equals("S")) {
				abrirNavegador();
			
			} else {
				format.mensagemTerminal(false, "Retornando ao Menu Principal, aguarde...");
				
			}
		
		} else {
			format.limparTerminal();

			format.mensagemTerminal(true, "Resposta inesperada, por favor tente novamente...");
			
			format.limparTerminal();
			creditos();
			
		}

		format.delay(3);
	}
	
	
	public void abrirNavegador () {
		String url = "https://github.com/IanLucasOb/piratas-do-terminal";

		// Verifica se o desktop é suportado pela plataforma
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();

			try {
				// Abre o navegador com a URL fornecida
				desktop.browse(new URI(url));
				System.out.println("Abrindo navegador com URL: " + url);

			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();

			}
		} else {
			System.err.println("Ação de navegação não suportada.");
			System.out.println("Por favor, abra o seguinte link manualmente: " + url);
		}
	}
}
