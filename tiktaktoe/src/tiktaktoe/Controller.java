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
	
	public void clearScreen() throws IOException {  
		 for (int i = 0; i<30; i++) {
		       System.out.print('\n');
		    }
	}  
	
	//Spieler nach Namen fragen
	public void askNames(Marker player1,Marker player2) throws IOException {
		System.out.print("Spieler 1, wie ist dein Name?: ");
		player1.setName(tastaturInput.readLine());
		clearScreen();
		System.out.print("Spieler 2, wie ist denn dein Name?: ");
		player2.setName(tastaturInput.readLine());
		clearScreen();
	}
	
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
	
	public void askPlayer(Marker player) throws NumberFormatException, IOException {
		boolean turn = true;
		int x;
		int y;
		
		while (turn == true) {
		System.out.println(player.getName()+", mache deinen Zug!");
		System.out.print("X = ");
		x = Integer.parseInt(tastaturInput.readLine());
		System.out.print("Y = ");
		y = Integer.parseInt(tastaturInput.readLine());
		
		
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
	
}	

