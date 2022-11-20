package robo;

import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe o limite de pó: ");
		double limite = ler.nextDouble();
		Robo robo1 = new Robo(limite);
		int num = 0;

		double ml;

		System.out.println("\nDigite o número para: ");
		do {
			int cont = 0;
			System.out.println("(1) Ligar\n(2) Desligar\n(3) Andar\n(4) Aspirar\n(5) Parar\n(6) Sair\n");
			num = ler.nextInt();
			
			if (num != 1 && num != 2 && num != 3 && num != 4 && num != 5 && num != 6) {
				System.out.println("\nOpção inválida, tente novamente\n");
			}
			switch (num) {
			case 1:
				robo1.setStatus(RoboStatus.LIGADO);
				System.out.println("Status: " + robo1.getStatus() + "\n");
				break;
			case 2:
				robo1.setStatus(RoboStatus.DESLIGADO);
				System.out.println("Status: " + robo1.getStatus() + "\n");
				break;
			case 3:
				if (robo1.getStatus() == RoboStatus.LIGADO) {
					do {
						int x, y;
						System.out.printf("\nDigite a posição do eixo X: ");
						x = ler.nextInt();
						System.out.printf("Digite a posição do eixo Y: ");
						y = ler.nextInt();
						robo1.andar(x, y);
						robo1.setStatus(RoboStatus.ANDANDO);
						System.out.println("\n Status do aspirador: " + robo1.getStatus());
						System.out.println("Posição atual do aspirador\n   X: " + robo1.getX() + " Y: " + robo1.getY());
						do {
							System.out.println("\n(1) Continuar andando\n(2) Parar");
							cont = ler.nextInt();
						} while (cont != 1 && cont != 2);
						if (cont == 2) {
							robo1.setStatus(RoboStatus.PARADO);
							System.out.println("\nStatus do aspirador: " + robo1.getStatus());
							System.out.println();
						}
					} while (cont == 1);
				} else {
					System.out.println(" O aspirador esta: " + robo1.getStatus());
					System.out.println(" É Necessário ligar para andar\n");
				}
				break;
			case 4: // opcao de aspirar
				if (robo1.getStatus() == RoboStatus.LIGADO) {
					do {
						System.out.printf("Quanto deseja aspirar: ");
						ml = ler.nextDouble();
						robo1.aspirar(ml);

						if (robo1.getStatus() == RoboStatus.LIGADO) {
							do {
								System.out.println("(1) Continuar aspirando\n(2) Parar");
								cont = ler.nextInt();
							} while (cont != 1 && cont != 2);
						} else {
							cont = 2;
						}
					} while (cont == 1);
				} else {
					System.out.println(" O aspirador esta: " + robo1.getStatus());
					System.out.println(" É Necessário ligar aspirar\n");
				}
			case 5:
				robo1.setStatus(RoboStatus.PARADO);
				System.out.println("\n Status do aspirador: " + robo1.getStatus());
			}
		} while (num != 6);

		System.out.println("\n Fim do programa");
		System.exit(0);
		ler.close();
	}
}
