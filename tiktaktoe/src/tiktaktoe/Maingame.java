package tiktaktoe;

import java.io.IOException;

public class Maingame {
	
	public static void main(String[] args) throws IOException{

		
		//Variable für Gameloop
		boolean loop = true;
		
		//Neue Spieler und Spielfeld
		Marker player1 = new Marker('+');
		Marker player2 = new Marker('o');
		Gamefield game = new Gamefield();
		
		//Gamecontroller
		Controller c1 = new Controller(game);
		c1.clearScreen();
		
		//Spielfeld mit leeren Feldern befüllen
		game.setFields();
		
		//Nach Namen fragen
		c1.askNames(player1, player2);
		
		
		
		//Gameloop
		while (loop == true) {
			c1.drawFields();
			c1.askPlayer(player1);
			c1.drawFields();
			c1.askPlayer(player2);
		}
		
		
	}
	
}
