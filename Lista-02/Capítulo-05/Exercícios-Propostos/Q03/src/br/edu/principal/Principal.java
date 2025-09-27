package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_PESSOAS = 8;

        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;
        
        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade >= 16 && idade <= 30) {
                faixa2++;
            } else if (idade >= 31 && idade <= 45) {
                faixa3++;
            } else if (idade >= 46 && idade <= 60) {
                faixa4++;
            } else if (idade > 60) {
                faixa5++;
            }
        }
        
        System.out.println("\n" + "-".repeat(45));
        System.out.println("QUANTIDADE DE PESSOAS POR FAIXA ETÁRIA");
        System.out.println("Faixa 1 (Até 15 anos): " + faixa1 + " pessoas");
        System.out.println("Faixa 2 (16 a 30 anos): " + faixa2 + " pessoas");
        System.out.println("Faixa 3 (31 a 45 anos): " + faixa3 + " pessoas");
        System.out.println("Faixa 4 (46 a 60 anos): " + faixa4 + " pessoas");
        System.out.println("Faixa 5 (Acima de 60 anos): " + faixa5 + " pessoas");
        System.out.println("-".repeat(45));

        double totalPessoas = TOTAL_PESSOAS;

        double percentualFaixa1 = (faixa1 / totalPessoas) * 100;
        
        double percentualFaixa5 = (faixa5 / totalPessoas) * 100;

        System.out.println("PORCENTAGEM DE PESSOAS NA PRIMEIRA FAIXA (Até 15 anos)");
        System.out.printf("   %.2f%%\n", percentualFaixa1);

        System.out.println("\n PORCENTAGEM DE PESSOAS NA ÚLTIMA FAIXA (Acima de 60 anos)");
        System.out.printf("   %.2f%%\n", percentualFaixa5);
        System.out.println("-".repeat(45));
    }
}