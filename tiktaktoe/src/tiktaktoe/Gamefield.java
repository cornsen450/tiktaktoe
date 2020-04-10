package tiktaktoe;

public class Gamefield {
	
	//Erstellt eine Matrix von 3x3 mit Datentyp Feld
	private Field[][] fields=new Field[3][3];
	
	//Konstruktor vom Gamefield
	public Gamefield() {
		setFields();
	}
	
	public Field[][] getFields() {
		return fields;
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
}
