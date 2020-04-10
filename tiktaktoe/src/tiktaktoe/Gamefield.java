package tiktaktoe;

public class Gamefield {
	
	//Erstellt eine Matrix von 3x3 mit Datentyp Feld
	private Field[][] fields=new Field[3][3];
	
	//Konstruktor vom Gamefield
	public Gamefield() {
		setFields();
	}
	
	//Das Spielfeld leeren
	public void resetGame() {
		setFields();
	}
	
	//Die Spielfelder Koordinaten setzen und mit - markieren als leer
	public void setFields() {
		for (int x=0;x<3;x++) {
			for (int y=0;y<3;y++) {
				fields[x][y]=new Field(x,y,new Marker('-'));
			}
		}
	}
	
	
	//Funktion zum Zeichnen der Felder
	public void drawFields() {
		System.out.println("Tiktaktoe Game:");
		System.out.println();
		System.out.println("  123");
		System.out.print("1 ");
		for (int x=0;x<3;x++) {
			System.out.print(fields[x][0].getMarker().getSign());
		}
		System.out.println();
		System.out.print("2 ");
		for (int x=0;x<3;x++) {
			System.out.print(fields[x][1].getMarker().getSign());
		}
		System.out.println();
		System.out.print("3 ");
		for (int x=0;x<3;x++) {
			System.out.print(fields[x][2].getMarker().getSign());
		}
	}

}
