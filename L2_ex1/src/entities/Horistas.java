package entities;

public class Horistas extends Funcionario{

	private double horas;
	private double valorHora;
	
	public Horistas(String nome, String sobrenome, double horas, double valorHora) {
		super(nome, sobrenome);
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public double ganhoHorista() {
		return horas * valorHora;
	}
	
	@Override
	public String toString() {
		return "Horistas: " + getNome() + " " + getSobrenome() + ", ganho por mês: " + ganhoHorista() + "\n";
	}
	
	
	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
