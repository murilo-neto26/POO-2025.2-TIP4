package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número de 1 a 9: ");
	int n = sc.nextInt();
	if (n >= 1 && n <= 9) {
		Multiplicacao.multiplicando(n);
	}
	else {
		System.out.println("Digite apenas números de 1 a 9.");
	}
  }
}