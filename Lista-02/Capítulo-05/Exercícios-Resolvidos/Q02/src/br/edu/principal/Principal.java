package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor para n:");
		double n = sc.nextDouble();
		double e = 1.0;
		int fat = 1;
		int i = 1;
		
		for (i = 1; i <= n; i++) {
			fat = fat * i;
			e = e + 1.0 / fat;
		}
		
		System.out.printf("Valor de E = %.5f\n", e);

	}

}