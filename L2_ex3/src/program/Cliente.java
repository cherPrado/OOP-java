package program;

public class Cliente extends Pessoa{

	private String telefone;

	public Cliente(String nome, String cpf, String telefone) {
		super(nome, cpf);
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return " - Dados do Cliente, nome: " + getNome() + " - CPF: " + getCpf() + " - Telefone: " + telefone;
	}
	
	
	
}
