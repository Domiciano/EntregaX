package exception;


public class NegativeNumberException extends Exception {
	
	public NegativeNumberException(String name, double weight) {
		super("Está intentando usar un número negativo "+weight+" para el ingrediente "+name);
	}

}
