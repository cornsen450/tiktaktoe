package tiktaktoe;

public class Marker {
	
	//Name des Spielers
	private String name;
	
	//Variablen für den Marker
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
