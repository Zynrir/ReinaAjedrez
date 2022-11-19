package modelo;

public enum Color {
	BlANCO("Blanco"), NEGRO("Negro");
	private String cadenaAMostrar;
	
	private Color(String cadenaAMostrar){
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	public String toString() {
		return cadenaAMostrar;
	}
}


