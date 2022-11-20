package program;
import java.util.ArrayList;

import entities.Administrador;
import entities.Comissionados;
import entities.Funcionario;
import entities.Gerente;
import entities.Horistas;

public class Principal {

	public static void main(String[] args) {
	
		ArrayList<Funcionario> funcionario = new ArrayList<>(); 
		
		//  Polimorfismo no ArrayList, todos os objetos que vão ser criados estão com o tipo Funcionario <<
		
		funcionario.add(new Horistas("Lucas", "Antunes", 184, 10));
		funcionario.add(new Horistas("Viviana", "Guedes", 140, 10));
		funcionario.add(new Administrador("Susy" , "Ferreira" , 1500));
		funcionario.add(new Administrador("Paulo" , "Prado" , 1500));
		funcionario.add(new Administrador("Laura" , "Nunes" , 1500));
		funcionario.add(new Administrador("Mario" , "Bismark" , 1500));
		funcionario.add(new Comissionados("Angela", "Ludes", 1000, 6500, 1.1));
		funcionario.add(new Comissionados("Bernad", "Fratern", 1000, 7890, 1.1));
		funcionario.add(new Comissionados("Michael", "Kaio", 1000, 10591, 1.1));
		funcionario.add(new Gerente("Gustavo", "Salvador", 2222.0, 0.2));
		
		for (Funcionario dados : funcionario) {
			System.out.println(dados.toString());
		}
	}
}
