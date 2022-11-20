package entidades;

import java.util.ArrayList;

public class Apartamento {
	private int numero;
	private int andar;
	private double matragem;
	private String situacao;
	
	ArrayList<Moradores> lista = new ArrayList<Moradores>();

	public Apartamento(int numero, int andar, double matragem, String situacao, ArrayList<Moradores> lista) {
		this.numero = numero;
		this.andar = andar;
		this.matragem = matragem;
		this.situacao = situacao;
		this.lista = lista;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public double getMatragem() {
		return matragem;
	}

	public void setMatragem(double matragem) {
		this.matragem = matragem;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public ArrayList<Moradores> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Moradores> lista) {
		this.lista = lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
