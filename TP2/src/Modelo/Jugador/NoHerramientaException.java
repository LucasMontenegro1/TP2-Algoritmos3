package Modelo.Jugador;

public class NoHerramientaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NoHerramientaException(String errorMessage) {
        super(errorMessage);
    }

}
