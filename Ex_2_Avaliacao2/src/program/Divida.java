package program;

public class Divida {
	String descricao;
	double valorTotal;
	int qtdePrestacoes;
	int qtdePagas;

	public Divida(String descricao, double valorTotal, int qtdePrestacoes) {
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.qtdePrestacoes = qtdePrestacoes;
	}

	public void pagaPrestacao(int qtdePagas) {
		this.qtdePagas = this.qtdePagas + qtdePagas;
	}

	public double calculaPrestacao() {
		return valorTotal / qtdePrestacoes;
	}

	public double calculaSaldoDevedor() {
		double a = valorTotal / qtdePrestacoes;
		double b = qtdePagas * a;
		return valorTotal - b;
	}

	public String toString() {
		return descricao + " - Valor: " + valorTotal + " - quantidade de prestacoes: " + qtdePrestacoes
				+ " - saldo devedor: " + this.calculaSaldoDevedor() + " - prestações pagas: " + qtdePagas
				+ " - valor da prestacao: " + this.calculaPrestacao() + "\n\n";
	}

}
