package entidades;

public class Funcionario {

	private String nome;
	private String telefone;
	private String matricula;
	private double salario;
	private int horario;
	
	public Funcionario(String nome, String telefone, String matricula, double salario, int horario) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.salario = salario;
		this.horario = horario;
	}
	
	public void aumento(double percentual) {
		percentual = (percentual/100) + 1;
		salario = salario * percentual; 
	}
	
	public double anual() {
		return salario * 12;
	}
	
	@Override
	public String toString() {
		return "Funcionario [\nnome=" + nome + "\ntelefone=" + telefone + "\nmatricula=" + matricula + "\nsalario="
				+ salario + "\nhorario=" + horario + "\nSalario anual= " + anual();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	
	
}
