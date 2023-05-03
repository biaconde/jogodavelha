package jogodavelha;

import java.io.Console;
import java.util.Scanner;

public class JogoDaVelhaConsoleApp {
	
	public void iniciar() {
		System.out.println("COMEÇOU!!");
		System.out.println("JOGADOR 1 - O");
		System.out.println("JOGADOR 2 - X");
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		Scanner scanner = new Scanner(System.in);
		boolean jogador1 = true;
		while(!jogoDaVelha.isGameOver()) {
			
			int numeroJogador = 1;
			if(!jogador1) {
				numeroJogador = 2;
			}
			
			Integer jogada = null;
			
			do {
				System.out.println("Qual a jogada do jogador " + numeroJogador + "? (possições de 0 a 8)");
				String j1 = scanner.nextLine();
				jogada = Integer.parseInt(j1);
			} while(!jogoDaVelha.isJogadaValida(jogada));
			
			
			if(jogador1) {
				jogoDaVelha.playO(jogada);
			} else {
				jogoDaVelha.playX(jogada);
			}
			System.out.println(jogoDaVelha);
			jogador1 = !jogador1;
						
		}
		scanner.close();
		System.out.println("GAME OVER!!!");
		
		if(jogoDaVelha.isJogador1Ganhou()) {
			System.out.println("VENCEDOR : JOGADOR 1");
		} else if(jogoDaVelha.isJogador2Ganhou()) {
			System.out.println("VENCEDOR : JOGADOR 2");
		} else {
			System.out.println("DEU VELHA!!!");
		}
	}

	public static void main(String[] args) {
		JogoDaVelhaConsoleApp app = new JogoDaVelhaConsoleApp();
		app.iniciar();
	}
}
