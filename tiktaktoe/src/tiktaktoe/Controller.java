package tiktaktoe;

import java.io.*;

public class Controller {
	
	//Bufferreader für Input 
	BufferedReader tastaturInput = new BufferedReader(new InputStreamReader(System.in));
	private Gamefield gamefield; 
	
	//Konstruktor Controller
	public Controller(Gamefield gamefield) {
		this.gamefield = gamefield;
	}
	
	
	//Console leer machen für neuen Output
	public void clearScreen() throws IOException {  
		 for (int i = 0; i<30; i++) {
		       System.out.print('\n');
		    }
	}  
	
	//Punkte anzeigen
	public void showPoints(Marker player1, Marker player2) {
		System.out.println("Es steht: ");
		System.out.println(player1.getName() + " " + player1.getPunkte() + " : " + player2.getPunkte() + " "+ player2.getName());
	}
	
	//Spieler nach Namen fragen
	public void askNames(Marker player1,Marker player2) throws IOException {
		System.out.print("Spieler 1 (+), wie ist dein Name?: ");
		player1.setName(tastaturInput.readLine());
		clearScreen();
		System.out.print("Spieler 2 (o), wie ist denn dein Name?: ");
		player2.setName(tastaturInput.readLine());
		clearScreen();
	}
	
	//Spielfeld in Console wiedergeben
	public void drawFields() {
		System.out.println("Tiktaktoe Game:");
		System.out.println();
		System.out.println("  123");
		System.out.print("1 ");
		for (int x=0;x<3;x++) {
			System.out.print(gamefield.getFields()[x][0].getMarker().getSign());
		}
		System.out.println();
		System.out.print("2 ");
		for (int x=0;x<3;x++) {
			System.out.print(gamefield.getFields()[x][1].getMarker().getSign());
		}
		System.out.println();
		System.out.print("3 ");
		for (int x=0;x<3;x++) {
			System.out.print(gamefield.getFields()[x][2].getMarker().getSign());
		}
		System.out.println();
		System.out.println();
	}
	
	//Spieler nach Eingabe fragen
	public void askPlayer(Marker player) throws NumberFormatException, IOException {
		boolean turn = true;
		int x;
		int y;
		int z = 0;
		
		//Schleife für den Zug des Spielers bis gültige Angabe gemacht worde
		while (turn == true) {
		System.out.println(player.getName()+ " (" + player.getSign() + ")" + ", mache deinen Zug!");
		System.out.print("XY = ");
		
		
		//Check ob auch nur Zahlen eingegeben worden sind
		try {
			z = Integer.parseInt(tastaturInput.readLine());
		} catch (java.lang.NumberFormatException e) {
			clearScreen();
			System.out.println("Nur Zahlen gültig!! Du bist nochmal an der Reihe!!");
			drawFields();
			continue;
		}
		
		//Berechnung der X und Y Koordinaten
		x = z / 10;
		y = z % 10;
		
		
		//Schauen ob Koordinaten im Feld liegen
		if (y < 1 || y > 3 || x < 1 || x > 3) {
			clearScreen();
			System.out.println("Angabe außerhalb des Feldes!!!  Du bist nochmal an der Reihe!!");
			drawFields();
			continue;
		}
		
		
		//Wenn Feld frei ist wird der Marker gesetzt 
		if  (gamefield.getFields()[y-1][x-1].checkemptyField()) {
			gamefield.getFields()[y-1][x-1].setMarker(player);
			clearScreen();
			turn = false;
			}
		
		else {
			clearScreen();
			System.out.println("Feld ist schon besetzt!!! Du bist nochmal an der Reihe!!!");
			System.out.println("");
			drawFields();
			
			
		}
		
		}
	
	}
	
	
	//Überprüfen ob jemand gewonnen hat
		public void checkWin(Gamefield gamefield, Field[][] fields, Marker marker) {
			fields = gamefield.getFields();
		
			//Vertikale 1 WIN
			if (fields[0][0].getMarker().getSign() == marker.getSign() && fields[0][1].getMarker().getSign() == marker.getSign() && fields[0][2].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Vertikale 2 WIN
			if (fields[1][0].getMarker().getSign() == marker.getSign() && fields[1][1].getMarker().getSign() == marker.getSign() && fields[1][2].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Vertikale 3 WIN
			if (fields[2][0].getMarker().getSign() == marker.getSign() && fields[2][1].getMarker().getSign() == marker.getSign() && fields[2][2].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Horizontale 1 WIN
			if (fields[0][0].getMarker().getSign() == marker.getSign() && fields[1][0].getMarker().getSign() == marker.getSign() && fields[2][0].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Horizontale 2 WIN
			if (fields[0][1].getMarker().getSign() == marker.getSign() && fields[1][1].getMarker().getSign() == marker.getSign() && fields[2][1].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Horizontale 3 WIN
			if (fields[0][2].getMarker().getSign() == marker.getSign() && fields[1][2].getMarker().getSign() == marker.getSign() && fields[2][2].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Diagonale 1 WIN
			if (fields[0][0].getMarker().getSign() == marker.getSign() && fields[1][1].getMarker().getSign() == marker.getSign() && fields[2][2].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			//Diagonale 2 WIN
			if (fields[0][2].getMarker().getSign() == marker.getSign() && fields[1][1].getMarker().getSign() == marker.getSign() && fields[2][0].getMarker().getSign() == marker.getSign()) {
				System.out.println(marker.getName() + " gewinnt die Runde !!!");
				System.out.println("Herzlichen Glückwunsch!! :) ");
				System.out.println("");
				marker.setPunkte(1);
				gamefield.resetGame();
			}
			
			
	
}	

}