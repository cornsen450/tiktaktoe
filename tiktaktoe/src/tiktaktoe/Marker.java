package tiktaktoe;

public class Marker {
	
	//Variablen f�r den Marker
	private char sign;
	
	//Konstruktor vom marker
	public Marker(char marker) {
		this.setSign(marker);
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char marker) {
		this.sign = marker;
	}

	
}
