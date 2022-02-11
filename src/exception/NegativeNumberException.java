package exception;


public class NegativeNumberException extends Exception {
	
	public NegativeNumberException(String name, double weight) {
		super("Est� intentando usar un n�mero negativo "+weight+" para el ingrediente "+name);
	}

}
