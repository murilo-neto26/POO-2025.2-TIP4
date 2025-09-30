package br.edu.principal;

import java.util.Scanner;
import br.edu.util.Somador;
public class Principal {

	public static void main(String[] args) {
		int num1, num2, s;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		s = Somador.somar(num1, num2);
		
		System.out.printf("A soma dos números de " + num1 + " até " + num2 + " é: " + s);
		

	}

}

