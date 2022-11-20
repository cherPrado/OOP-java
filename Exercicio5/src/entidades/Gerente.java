package entidades;

public class Gerente extends Funcionario {

	private double bonificação;
	private String tipoPessoa;
	
	public Gerente(String nome, String telefone, String matricula, double salario, int horario, double bonificação,
			String tipoPessoa) {
		super(nome, telefone, matricula, salario, horario);
		this.bonificação = bonificação;
		this.tipoPessoa = tipoPessoa;
	}

	
	
	@Override
	public String toString() {
		return "Gerente [\nnome=" + getNome() + "\ntelefone=" + getTelefone() + "\nmatricula=" + getMatricula() + "\nsalario="
				+ getSalario() + "\nhorario=" + getHorario() + "\nSalario anual= " + anual();
	}



	public double getBonificação() {
		return bonificação;
	}

	public void setBonificação(double bonificação) {
		this.bonificação = bonificação;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	
	
	
}
