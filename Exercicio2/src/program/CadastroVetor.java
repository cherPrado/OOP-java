package program;

import java.util.Scanner;

public class CadastroVetor {
	// Exercício 2.3
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantos moradores serão cadastrados: ");
		int n = ler.nextInt();
		Moradores[] vet = new Moradores[n];
		char c = 's';
		char sexo;
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("\nInforme o nome do morador: ");
			String name = ler.next();
			System.out.printf("Informe o CPF do morador: ");
			String cpf = ler.next();
			System.out.printf("Informe o celular do morador: ");
			String celular = ler.next();
			System.out.printf("Informe a data de Nascimento do morador: ");
			String dataNascimento = ler.next();
			do {
			System.out.printf("Informe o sexo do morador feminino(f) ou de Masculino(m): ");
			sexo = ler.next().charAt(0);
			}while(sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'm');
			System.out.printf("Informe o bloco do morador: ");
			String bloco = ler.next();
			System.out.printf("Informe o apartamento do morador: ");
			String apartamento = ler.next();
			System.out.printf("Informe o código de acesso do morador: ");
			String codigoAcesso = ler.next();
			vet[i] = new Moradores(name, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
			
			System.out.println(vet[i].toString());
			
			System.out.println("Digite 's' ou 'S' para cadastrar mais um morador: ");
			c = ler.next().charAt(0);
			if(c  != 's' && c != 'S') {
				break;
			}
		}
		ler.close();
	}
}

