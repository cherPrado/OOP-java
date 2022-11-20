package entidades;

public class Gerente extends Funcionario {

	private double bonifica��o;
	private String tipoPessoa;
	
	public Gerente(String nome, String telefone, String matricula, double salario, int horario, double bonifica��o,
			String tipoPessoa) {
		super(nome, telefone, matricula, salario, horario);
		this.bonifica��o = bonifica��o;
		this.tipoPessoa = tipoPessoa;
	}

	
	
	@Override
	public String toString() {
		return "Gerente [\nnome=" + getNome() + "\ntelefone=" + getTelefone() + "\nmatricula=" + getMatricula() + "\nsalario="
				+ getSalario() + "\nhorario=" + getHorario() + "\nSalario anual= " + anual();
	}



	public double getBonifica��o() {
		return bonifica��o;
	}

	public void setBonifica��o(double bonifica��o) {
		this.bonifica��o = bonifica��o;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	
	
	
}
