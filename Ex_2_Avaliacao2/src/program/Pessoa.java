package program;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String cpf;
	public static ArrayList<Divida> dividas = new ArrayList<Divida>(); // ArrayList criado para as dividas

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// Composição aqui no criaDivida.
	public void criaDivida(String descricao, double valorTotal, int qtdePrestacoes) {

		dividas.add(new Divida(descricao, valorTotal, qtdePrestacoes));
	}

	public String mostraDivida() { // Mostra as dívidas pegando lá do toString da classe Divida.
		return dividas.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {

		return "Nome : " + nome + " - CPF : " + cpf;
	}

	public Divida getDivida(int index) {
		return dividas.get(index);
	}

}