package com.sophos.certificacion.searchcomputrabajo.exceptions;

public class ConnectionFailed extends AssertionError{

	/**
	 * Mensaje cuando hay error de conexión
	 */
	private static final long serialVersionUID = 1L;
	private static final String CONNECTION_ERROR = "Connection error to the page";
	
	public static String getConnectionFailed() {
		return CONNECTION_ERROR; 
	}
	
	public ConnectionFailed(String message, Throwable cause) {
		super(message, cause);
	}

}
