package modelo;

public enum Color {
	BlANCO("Blanco"), NEGRO("Negro");
	private String cadenaAMostrar;
	
	private Color(String cadenaAMostrar){
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	@Override
	
	public String toString() {
		return cadenaAMostrar;
	}
}


