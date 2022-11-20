package entities;

public class Comissionados extends Funcionario{

	private double salario;
	private double vendas;
	private double comissao;
	
	public Comissionados(String nome, String sobrenome, double salario, double vendas, double comissao) {
		super(nome, sobrenome);
		this.salario = salario;
		this.vendas = vendas;
		this.comissao = comissao;
	}
	
	public double ganhoComissionados() {
		return salario + vendas * comissao;
	}

	@Override
	public String toString() {
		return "Comissionados: " + getNome() + " " + getSobrenome() + ", ganho por mês: " + ganhoComissionados() + "\n";
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
 }
