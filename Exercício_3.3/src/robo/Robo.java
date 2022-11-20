package robo;

public class Robo {

	private static int numero = 0;
	private double x;
	private double y;
	private double quantidadeDePo;
	private double limiteDePo;
	private RoboStatus status;

	public Robo(double limiteDePo) {
		numero++;
		x = 0;
		y = 0;
		quantidadeDePo = 0;
		this.limiteDePo = limiteDePo;
		status = RoboStatus.DESLIGADO;
	}

	public void andar(double x, double y) {
		setY(this.y += y);
		setX(this.x += x);
	}

	public void aspirar(double quantidadeDePo) {
		this.quantidadeDePo += quantidadeDePo;

		if (this.quantidadeDePo <= limiteDePo) {
			System.out.println("Quantidade de pó atual: " + this.quantidadeDePo + "\n");
		} else {
			this.quantidadeDePo = limiteDePo;
			status = RoboStatus.DESLIGADO;
			System.out.println("\nLimite de " + limiteDePo + " atingido");
			System.out.println("Status: " + getStatus() + "\n");
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getQuantidadeDePo() {
		return quantidadeDePo;
	}

	public void setQuantidadeDePo(double quantidadeDePo) {
		this.quantidadeDePo = quantidadeDePo;
	}

	public double getLimiteDePo() {
		return limiteDePo;
	}

	public void setLimiteDePo(double limiteDePo) {
		this.limiteDePo = limiteDePo;
	}

	public static int getNumero() {
		return numero;
	}

	public RoboStatus getStatus() {
		return status;
	}

	public void setStatus(RoboStatus status) {
		this.status = status;
	}

}
