package aplicação;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Moradores;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Exercicio 3.2
		
		ArrayList<Moradores> lista = new ArrayList<Moradores>();
		char sexo;
		char c = 's';
		do {
			System.out.printf("\nInforme o nome do morador: ");
			String name = sc.nextLine();
			System.out.printf("Informe o CPF do morador: ");
			String cpf = sc.nextLine();
			System.out.printf("Informe o celular do morador: ");
			String celular = sc.nextLine();
			System.out.printf("Informe a data de Nascimento do morador: ");
			String dataNascimento = sc.nextLine();
			do {
				System.out.printf("Informe o sexo do morador feminino(f) ou de Masculino(m): ");
				sexo = sc.nextLine().charAt(0);
				}while(sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'm');
			System.out.printf("Informe o bloco do morador: ");
			String bloco = sc.nextLine();
			System.out.printf("Informe o apartamento do morador: ");
			String apartamento = sc.nextLine();
			System.out.printf("Informe o código de acesso do morador: ");
			String codigoAcesso = sc.nextLine();
			Moradores n = new Moradores(name, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
			System.out.printf("\nDeseja cadastrar um novo morador? 'S' ou 's' para continuar: ");
			lista.add(n);
			c = sc.nextLine().charAt(0);
			
		}while(c  == 's' || c == 'S');
		
		System.out.println("\n ============ Dados dos moradores cadastrados ============");
		System.out.println(lista.toString());
		
		System.out.print("\nQuantidade de moradores cadastrados: ");
		System.out.println(Moradores.getCodigo_sequencial());
		
		sc.close();
	}
}
