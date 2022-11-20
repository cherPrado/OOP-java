package ex2;

public class Loja extends LojaAbstract {

	private String endereco;
	private String gerente;
	
	private Registro registro;

	public Loja(String identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
		super(identificador, cnpj, razaoSocial);
		this.setEndereco(endereco);
		this.setGerente(gerente);
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
	public String retornarTodosOsDados() {
		return super.toString() + " - Endereço: " + endereco + " - Gerente: " + gerente;
	}
}
