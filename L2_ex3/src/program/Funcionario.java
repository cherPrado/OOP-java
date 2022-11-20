package program;

public class Funcionario extends Pessoa {

	private int matricula;

	public Funcionario(String nome, String cpf, int matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return " - Dados do Funcionario, nome: "+ getNome() + " - CPF: " + getCpf() + " - Matricula: " + matricula;
	}

	
	
}
