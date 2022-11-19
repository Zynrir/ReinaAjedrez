package modelo;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;
	
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	/*
	 * Constructor copia
	 */
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("Campo vacio");
		}
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
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

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}

	

}
