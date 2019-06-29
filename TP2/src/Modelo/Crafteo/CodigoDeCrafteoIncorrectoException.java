package Modelo.Crafteo;

public class CodigoDeCrafteoIncorrectoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CodigoDeCrafteoIncorrectoException(String errorMessage) {
        super(errorMessage);
    }
	
}
