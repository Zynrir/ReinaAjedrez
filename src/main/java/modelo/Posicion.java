package modelo;

public class Posicion {

	private int fila;
	private char columna;
	
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}



	public int getFila() {
		return fila;
	}



	private void setFila(int fila) {
		if (1< fila || 8> fila) {
			throw new IllegalArgumentException("Fila incorrecta");
		}
		this.fila = fila;
		
	}



	public char getColumna() {
		return columna;
	}



	private void setColumna(char columna) {
		if ('a'< columna || 'h'> columna) {
			throw new IllegalArgumentException("Columna incorrecta");
		}
		this.columna = columna;
	}

	

}