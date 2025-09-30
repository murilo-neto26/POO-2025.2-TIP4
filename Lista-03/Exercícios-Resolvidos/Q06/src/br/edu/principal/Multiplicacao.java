package br.edu.principal;

public class Multiplicacao {
	public static void multiplicando(int n) {
		System.out.println("Tabuada do " + n + ":");
		for  (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + " = " + (n *i));
		}
	}
}
