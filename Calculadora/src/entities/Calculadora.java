package entities;

public class Calculadora {

	private int a;
	private int b;
	
	public Calculadora(int a, int b) {
		this.setA(a);
		this.setB(b);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public int Soma(int a, int b) {
		return a + b;
	}
	
	public int Subtracao(int a, int b) {
		return a - b;
	}
	
	public int Divisao(int a, int b) {
		return (a / b);
	}
	
	public int Multiplicacao(int a, int b) {
		return a * b;
	}
}
