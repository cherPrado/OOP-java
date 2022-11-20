package program;

public class Atendimento {

	private String data;
	private String descricao;
	private Funcionario funcionario;
	private Aparelho aparelho;

	public Atendimento(String data, String descricao, Funcionario funcionario, Aparelho aparelho) {
		this.data = data;
		this.descricao = descricao;
		this.funcionario = funcionario;
		this.aparelho = aparelho;
	}
	
	
	
	@Override
	public String toString() {
		return funcionario + " - Data do atendimento: " + data + " - Descricao: " + descricao;
	}



	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Aparelho getAparelho() {
		return aparelho;
	}

	public void setAparelho(Aparelho aparelho) {
		this.aparelho = aparelho;
	}

}
