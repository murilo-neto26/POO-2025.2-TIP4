package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Escreva o segundo número: ");
		int num2 = sc.nextInt();

		int subtracao = (num1 - num2);

		System.out.println("A subtração é : " + subtracao);
		
	}

}