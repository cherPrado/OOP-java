package principal;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inicial = 0, fim = 0, inteiros = 0, pares = 0;

		System.out.println("Digite o numero inicial e logo em seguida o numero final: ");
		inicial = sc.nextInt();
		fim = sc.nextInt();
		
		int soma = inicial + fim;
		double media = (double)(inicial + fim)/2;
		
		for(int i = inicial;  i <= fim; i++ ) {
			inteiros++;
			if(i % 2 == 0) 
				pares++;
		}
		
		System.out.println();
		System.out.printf("Quantidade de números inteiros dentro do intervalo *aberto*: %d\n", inteiros - 2);
		System.out.println("Quantidade de números inteiros dentro do intervalo *fechado*: " + inteiros);
		System.out.println("A soma dos numeros: " + soma);
		System.out.println("A media dos numeros: " + media);
		System.out.println("Quantidade de números pares: " + pares);
		
		sc.close();
	}
}
