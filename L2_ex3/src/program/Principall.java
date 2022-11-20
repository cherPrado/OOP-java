package program;

import java.util.ArrayList;

public class Principall {

	public static void main(String[] args) {
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		Cliente cliente1 = new Cliente("Jose da Silva Prado", "123456789-2", "(62) 99879-5533");
		Funcionario funcionario1 = new Funcionario("Joao Felipe Augusto", "165145189-1", 1254);
		Aparelho aparelho1 = new Aparelho("122", 2022, "Xiaomi", "Poco Phone", cliente1);
		
		aparelho1.criaAtendimento("22/08/22", "Celular vendido e entregue, nota fiscal emitida", funcionario1, aparelho1);

		lista.add(cliente1);
		lista.add(funcionario1);
		
		Cliente cliente2 = new Cliente("Ana Padrão Nunes", "998856789-3", "(62) 99987-7778");
		Funcionario funcionario2 = new Funcionario("Carolina de Lima", "775845189-1", 5874);
		Aparelho aparelho2 = new Aparelho("156", 2022, "Iphone", "13 Pro Max", cliente2);
		
		aparelho2.criaAtendimento("07/11/21", "Celular vendido e entregue, nota fiscal emitida", funcionario2, aparelho2);

		lista.add(cliente2);
		lista.add(funcionario2);
		
		System.out.println(aparelho1.toString());
		System.out.println(aparelho2.toString());
	}

}
