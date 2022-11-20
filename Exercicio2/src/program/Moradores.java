package program;

public class Moradores {
	
	// Exercício 2.1
	public String name;
	public String cpf;
	public String celular;
	public String dataNascimento;
	public char sexo;
	public String bloco;
	public String apartamento;
	public String codigoAcesso;
	
	public Moradores() {
		
	}
	
	public Moradores(String name, String cpf, String celular, String dataNascimento, char sexo, String bloco,
			String apartamento, String codigoAcesso) {
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
	
}
