package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double preco = 5;
		int ingres = 120;
		double total = 0;
		double lucro = 0;
		double decre = 0.5;
		Scanner sc = new Scanner(System.in);
		
		for(preco = 5; preco >= 1; preco-=0.5) {
			total = preco * ingres;
			ingres = ingres + 26;
			lucro = total - 200;
			System.out.println("O preço do ingresso: " + preco + "," + " o lucro esperado: " + lucro +
			"," + " a quantidade de ingressos: " + ingres);
        }
	}
}
