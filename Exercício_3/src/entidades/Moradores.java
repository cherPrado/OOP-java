package entidades;

public class Moradores {
	// Exercicio 3.1
	private String name;
	private String cpf;
	private String celular;
	private String dataNascimento;
	private char sexo;
	private String bloco;
	private String apartamento;
	private String codigoAcesso;
	private static int codigo_sequencial;
	
	public Moradores(String name, String cpf, String celular, String dataNascimento, 
					 char sexo, String bloco, String apartamento,String codigoAcesso) {
		
		codigo_sequencial++; //Exercicio 3.1
		
		this.name = name;
		this.cpf = cpf;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.bloco = bloco;
		this.apartamento = apartamento;
		this.codigoAcesso = codigoAcesso;
	}
	

	public String toString() {
		return "\nNome do morador: " + name + "\n" 
				+ "CPF: " + cpf + "\n" 
				+ "Celular: "+ celular+ "\n"
				+ "Data de nascimento: "+ dataNascimento +"\n"
				+ "Sexo:"+ sexo +"\n"
				+ "Bloco: "+ bloco+ "\n"
				+ "Apartamento: "+ apartamento + "\n"
				+ "Código de Acesso: "+ codigoAcesso + "\n"; 
	}



	public static int getCodigo_sequencial() {
		return codigo_sequencial;
	}



	public static void setCodigo_sequencial(int codigo_sequencial) {
		Moradores.codigo_sequencial = codigo_sequencial;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public String getBloco() {
		return bloco;
	}


	public void setBloco(String bloco) {
		this.bloco = bloco;
	}


	public String getApartamento() {
		return apartamento;
	}


	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}


	public String getCodigoAcesso() {
		return codigoAcesso;
	}


	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	
}
