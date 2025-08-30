package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();
		
		System.out.println("Digite o quarto número: ");
		int num4 = sc.nextInt();
		
		int soma = num1 + num2 + num3 + num4;
		
		System.out.println("A soma dos Quatros números, foi: " + soma);

	}

}
