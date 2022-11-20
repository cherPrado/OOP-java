package principal;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int matricula,
		x = 0, y = 0, z = 0;
		
		System.out.print("Entre com a matrícula do aluno: " );
		matricula = sc.nextInt();
		System.out.println("Matricula: " + matricula);
		System.out.println();
		
		int num = matricula;
		
		while(num >= 1000){
			num = num - 1000;
		}
			x = num % 10;
			num = num/10;
	
			y = num % 10;
			num = num / 10;
			
			z = num%10;
		
		if (z >= x)
			if (x >= y){
			    System.out.printf("Ordem crescente dos três ultimos números da matrícula: %d, %d, %d\n", y,  x, z);
			    System.exit(0);
			}
			else if (y <= z){
			    System.out.printf("Ordem crescente dos três últimos números da matrícula: %d, %d, %d\n", x, y, z);
			    System.exit(0);
			}
		if (x >= y)
			if (y >= z){
			    System.out.printf("Ordem crescente dos três últimos números da matrícula: %d, %d, %d\n", z, y, x);
			    System.exit(0);
			}
			else if (z <= x) {
			    System.out.printf("Ordem crescente dos três últimos números da matrícula: %d, %d, %d\n", y, z, x);
			    System.exit(0);
			}
		if (x <= y)
			if (z <= x){
				System.out.printf("Ordem crescente dos três últimos números da matrícula: %d, %d, %d\n", z, x, y);
				System.exit(0);
			}
			else if (z <= y){
				System.out.printf("Ordem crescente dos três últimos números da matrícula: %d, %d, %d\n", x, z, y);
			}
			
		sc.close();
	}

}
