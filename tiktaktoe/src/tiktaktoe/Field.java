package tiktaktoe;

public class Field {
	
	//Variablen der Klasse Field, Koordinaten und Spieler
	private int X;
	private int Y;
	private Marker marker;
	
	
	//Konstruktor vom Feld 
	public Field(int X,int Y,Marker marker) {
		this.X = X;
		this.Y = Y;
		this.marker = marker;
	}
	
	
	//Gucken ob das Feld leer ist
	public boolean checkemptyField() {
		if (marker.getSign() == '-') {
			return true;
		}
		return false;
		
	}

	public Marker getMarker() {
		return marker;
	}
	
	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

}