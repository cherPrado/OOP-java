package program;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Lucas", "132424"); // Pessoa instanciada

		p.criaDivida("Pessoal", 10000.00, 36); // As três dividas da pessoa instanciada
		p.criaDivida("Veiculo", 20000.00, 10);
		p.criaDivida("Mercado", 5000.00, 20);

		p.getDivida(0).pagaPrestacao(5); // passa os paramêtros para o método de pagar prestação
		p.getDivida(1).pagaPrestacao(8);
		p.getDivida(2).pagaPrestacao(10);

		System.out.println(p);
		System.out.println(p.mostraDivida()); //mostra divida pegando do toString da classe Divida
	}

}
