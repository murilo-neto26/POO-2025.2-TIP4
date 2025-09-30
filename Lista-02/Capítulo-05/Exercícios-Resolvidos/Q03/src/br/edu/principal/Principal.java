package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, n, num, j, fat;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite Quantos valores para n:");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.println("Digite o número " + i + ":");
			num = sc.nextInt();
			
			fat = 1;	
			for (j = 1; j <= num; j++) {
				fat = fat * j;
			}
			
			System.out.printf("O fatorial de %d é: %d\n", num, fat);
		}
		
	}

}