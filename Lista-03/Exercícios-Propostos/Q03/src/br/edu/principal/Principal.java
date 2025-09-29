package br.edu.principal;

import java.util.Scanner;
import br.edu.divisao.Divisao_num;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divisao_num util = new Divisao_num();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = util.verificarDivisor(num1, num2);

        if (resultado == 0) {
            System.out.println("0");
        } else if (resultado == -1) {
            System.out.println("Não há divisor de " + num1 + " maior que " + num2);
        } else {
            System.out.println("O primeiro número não é divisível pelo segundo.");
            System.out.println("Próximo divisor de " + num1 + " maior que " + num2 + ": " + resultado);
        }

    }
}