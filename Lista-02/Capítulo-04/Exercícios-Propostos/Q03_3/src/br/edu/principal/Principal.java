package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o 2º número: ");
		n2 = sc.nextDouble();
		
		if(n1 > n2) {
			System.out.println("O maior número é: " + n1);
		}
		
		else if(n2 > n1) {
			System.out.println("O maior número é: " + n2);		
		}
	}
}