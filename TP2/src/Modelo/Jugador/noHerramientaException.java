package Modelo.Jugador;

public class noHerramientaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public noHerramientaException(String errorMessage) {
        super(errorMessage);
    }

}
