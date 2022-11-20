package program;

import java.text.DecimalFormat;
import java.util.Scanner;

// dividindo as contas do casal proporcionalmente
// https://superdigital.com.br/blog/categorias/educacao-financeira/como-dividir-as-contas-do-casal

public class program {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Dividindo as contas do casal proporcionalmente");
        System.out.print("Gasto mensal: ");
        Double gastoMensal = sc.nextDouble();

        System.out.print("Sua renda: ");
        Double suaRenda = sc.nextDouble();

        System.out.print("Renda do cônjugue: ");
        Double rendaConjugue = sc.nextDouble();

        Double rendaTotal = suaRenda + rendaConjugue;

        Double maiorRenda = suaRenda >= rendaConjugue ? suaRenda : rendaConjugue;  
        Double menorRenda = suaRenda < rendaConjugue ? suaRenda : rendaConjugue;  

        Double porcentDeContribuicao = (maiorRenda/rendaTotal) * 100;

        Double maiorRendaContribuicao = (porcentDeContribuicao/100) * gastoMensal;

        System.out.println(" \nDivisão proporcional de gastos do casal: "
            + "\n -Renda: " + df.format(maiorRenda) + " contribuira com "+ df.format(porcentDeContribuicao)  +"%: R$ " + df.format(maiorRendaContribuicao)
            + "\n -Renda: " + df.format(menorRenda) + " contribuira com "+ df.format((100-porcentDeContribuicao))  +"%: R$ " +  df.format((gastoMensal - maiorRendaContribuicao))+"\n");


            
        sc.close();
    }
}
