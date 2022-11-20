package entities;

public class NumeroNegativo extends RuntimeException {
	private static final long serialVersionUID = 9159501284431703550L;

	public NumeroNegativo(String msg) {
		super(msg);
	}
}
