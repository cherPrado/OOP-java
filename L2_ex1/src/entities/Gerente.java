package entities;

public class Gerente extends Funcionario{

	private double salario;
	private double bonifica;
	
	public Gerente(String nome, String sobrenome, double salario, double bonifica) {
		super(nome, sobrenome);
		this.salario = salario;
		this.bonifica = bonifica;
	}

	public double salarioBonificado() {
		//bonifica é passado como porcentagem
		bonifica = bonifica + 1;
		return salario * bonifica;
	}
	
	@Override
	public String toString() {
		return "Gerente: " + getNome() + " " + getSobrenome() + ", ganho por mês: " + salarioBonificado() + "\n";
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonifica() {
		return bonifica;
	}

	public void setBonifica(double bonifica) {
		this.bonifica = bonifica;
	}
	
	
	
}

