package program;

import java.util.InputMismatchException;
import java.util.Scanner;
import entities.Calculadora;
import entities.NumeroNegativo;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		do {
			try {

				System.out.println("Digite o primeiro número: ");
				int a = sc.nextInt();
				System.out.println("Digite o segundo número: ");
				int b = sc.nextInt();
				Calculadora calc = new Calculadora(a, b);

				if (a < 0 && b < 0) 
					throw new NumeroNegativo("Os dois números são negativos");
				if (a < 0) 
					throw new NumeroNegativo("O primeiro número é negativo");	
				if (b < 0) 
					throw new NumeroNegativo("O segundo número é negativo");

				System.out.println("Soma: " + calc.Soma(a, b));
				System.out.println("Subtração: " + calc.Subtracao(a, b));
				System.out.println("Divisão " + calc.Divisao(a, b));
				System.out.println("Multiplicação: " + calc.Multiplicacao(a, b));

				System.out.println("\ndigite 1 para continuar ou 2 para parar: ");
				int n = sc.nextInt();
				if(n == 1)
					continuar = true;
				if(n == 2)
					continuar = false;
			} catch (ArithmeticException e) {
				System.out.println("\nNão é possivel dividir por zero\n");
			} catch (InputMismatchException e) {
				System.out.println("\nValor invalido\n");
			}
		} while (continuar == true);

		sc.close();
	}

}
/*
 * Crie uma classe de exceção NumeroNegativo herdando de RuntimeException, que
 * recebe uma mensagem e chama o construtor da classe pai passando a mensagem
 * 
 * ● Altere a classe principal para validar se os números informados são
 * negativos e levantar a exceção criada..
 */