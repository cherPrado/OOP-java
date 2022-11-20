package program;

import entidades.Clientes;
import entidades.Funcionario;
import entidades.Gerente;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario caixa = new Funcionario("João Antunes Oliveria", "6299894933", "202159798", 2200, 8);
		caixa.aumento(10);
		System.out.println(caixa.toString());
		
		Gerente gerente = new Gerente("Luis Carlos de Andrade", "62996493301", "202149491", 6000, 6, 2000, "PJ");
		gerente.aumento(20);
		System.out.println("\n");
		System.out.println(gerente.toString());
		System.out.println("\n");
		
		Clientes cliente1 = new Clientes("Pedro Alvarenga", "6299989896", 18, "47077456901");
		Clientes cliente2 = new Clientes("Mauru Nacada", "62996492244", 62, "987566221151");
		Clientes cliente3 = new Clientes("Maisa Luiza Borges", "62996558778", 39, "74536562021");
		cliente1.Desativar();
		
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		System.out.println(cliente3.toString());
	}

}
