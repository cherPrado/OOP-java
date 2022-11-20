package entities;

public class Administrador extends Funcionario{

	private double salario;

	public Administrador(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Administrador: " + getNome() + " " + getSobrenome() + ", ganho por mês: " + salario + "\n";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
