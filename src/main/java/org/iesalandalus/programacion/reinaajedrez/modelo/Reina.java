package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;  
	private Posicion posicion;
	
	public Reina() {
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1,'d'));
	}
	
	public Reina(Color color) {
		setColor(color);
		if (this.color == Color.BLANCO) {
			setPosicion(new Posicion(1,'d'));
		}else {
			setPosicion(new Posicion(8,'d'));
		}
	}
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if ( direccion == null ) {
			throw  new  NullPointerException ( "ERROR: La dirección no puede ser nula." );
		}
		if ( pasos >= 8 || pasos < 1 ) {
			throw  new  IllegalArgumentException ( "ERROR: El número de pasos debe estar comprendido entre 1 y 7." );
		}
		String movimientoNoValido = "ERROR: Movimiento no válido (se sale del tablero).";
		
		switch (direccion) {
		case NORTE:
			try {
				setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case NORESTE:
			try {
				setPosicion(new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() + pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case ESTE:
			try {
				setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna() + pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case SURESTE:
			try {
				setPosicion(new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() + pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case SUR:
			try {
				setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case SUROESTE:
			try {
				setPosicion(new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() - pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case OESTE:
			try {
				setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna() - pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
		case NOROESTE:
			try {
				setPosicion(new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() - pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException(movimientoNoValido);
			}
			break;
				default:
			break;
			}
	}
	@Override
	public String toString() {
		return String.format("color=%s, posicion=(%s)", color, posicion);
	}

			
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		this.posicion = posicion;
	}
	
	
}
