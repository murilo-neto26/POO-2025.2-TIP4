package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int num;
		int novo_num;
		int contador;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		for (contador = 0; contador <= 10; contador++) {
			novo_num = num*contador;
			System.out.println(num + " X " + contador + " é igual a: " + novo_num);
		}
        
	}
}
