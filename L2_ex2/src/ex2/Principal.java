package ex2;

public class Principal {

	public static void main(String[] args) {

		Loja m = new Loja("Matriz", "167515616-1", "684648746", "Av. Nacoes Unidas 37", "Caio Alberto");
		Loja f1 = new Loja("Filial", "346515616-2", "184644846", "Av. Parque Anhanguera 16", "Lucas Rubens");
		Loja f2 = new Loja("Filial", "251561456-3", "884364846", "Rua Hotelaria 97", "Joao Gomes");

		System.out.println(m.retornarTodosOsDados());
		System.out.println(f1.retornarTodosOsDados());
		System.out.println(f2.retornarTodosOsDados());

		m.registra_abertura_dia(); // Metodo da Interface implementado na classe LojaAbstract que mudar o status para Aberto
		f1.registra_abertura_dia();
		f2.registra_abertura_dia();

		System.out.println();
		System.out.println(m.retornarTodosOsDados()); // toString dos dados do objeto
		System.out.println(f1.retornarTodosOsDados());
		System.out.println(f2.retornarTodosOsDados());

		m.registra_fechamento_dia(); // Metodo para o fechamento das lojas

		System.out.println();
		System.out.println(m.retornarTodosOsDados());

		System.out.println(m.status());
	}

}
