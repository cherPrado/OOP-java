package ex2;

public class Principal {

	public static void main(String[] args) {
	
		Loja m = new Loja("Matriz", "167515616-1", "684648746", "Av. Nações Unidas 37", "Caio Alberto");
		Loja f1 = new Loja("Filial", "346515616-2", "184644846", "Av. Parque Anhanguera 16", "Lucas Rubens");
		Loja f2 = new Loja("Filial", "251561456-3", "884364846", "Rua Hotelaria 97", "João Gomes");

		System.out.println(m.retornarTodosOsDados());
		System.out.println(f1.retornarTodosOsDados());
		System.out.println(f2.retornarTodosOsDados());
		
	
	}

}
