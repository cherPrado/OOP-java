package program;

public class Aparelho {

	private String codigo;
	private int ano;
	private String marca;
	private String modelo;
	private Cliente cliente;
	private Atendimento atendimento;
	
	public Aparelho(String codigo, int ano, String marca, String modelo, Cliente cliente) {
		this.codigo = codigo;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
	}
	
	public void criaAtendimento(String data, String descricao, Funcionario funcionario, Aparelho aparelho) {
		atendimento = new Atendimento(data, descricao, funcionario, aparelho);
	}

	public String toString() {
		return "Codigo da compra: "+codigo + " - Ano: "+ ano + " - Marca: " + marca + cliente + atendimento;
	}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	
	
}
