package tiktaktoe;

public class Maingame {
	
	public static void main(String[] args){
		//Variable f�r Gameloop
		boolean game = true;
		
		//Neues Spielfeld
		Gamefield game1 = new Gamefield();
		
		//Spielfeld mit Feldern bef�llen
		game1.setFields();
		
		//Spielfeld zeichen
		game1.drawFields();
		
		//Gameloop
		while (game == true) {
			//Hier kommen abfragen an den Spieler etc. hin
		}
		
		
	}
	
}
