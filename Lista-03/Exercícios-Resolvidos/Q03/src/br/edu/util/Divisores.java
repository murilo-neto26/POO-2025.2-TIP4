package br.edu.util;

public class Divisores {
	public static int divisor(int a, int b, int c) {
		
		int soma = 0;
		for (int i = a; i <= b; i++) {
			if (i % c == 0) {
				soma += i;
			}
		}
		return soma;
	}
}
