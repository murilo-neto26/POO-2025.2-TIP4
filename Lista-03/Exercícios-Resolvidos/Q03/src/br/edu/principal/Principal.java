package br.edu.principal;

import java.util.Scanner;
import br.edu.util.Divisores;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, resultado;
		
		do {
            System.out.print("Digite um valor para A (deve ser maior que 1): ");
            a = sc.nextInt();
        } while (a <= 1);
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextInt();
		
		resultado = Divisores.divisor(a, b, c);
		
		System.out.printf("A soma dos números inteiros entre " + b + " e " + c + " que são divisíveis por " + a + " é: %d\n" , resultado);
		


	}

}

