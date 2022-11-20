package entidades;

public class Clientes {
	
	private String nome;
	private String telefone;
	private int idade;
	private String cpf;
	private String status;
	
	public Clientes(String nome, String telefone, int idade, String cpf) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
		this.status = "ATIVO";
	}
	
	public void Desativar() {
		status = "INATIVO";
	}
	
	public String toString() {
		return nome + " - Tel: " + telefone + " - idade: " + idade + " anos - CPF: " + cpf + " - " + status;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 

	
	
}
