package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o preço do produto: ");
		double preco = sc.nextDouble();

		double novop = preco - (preco*10/100);

		System.out.println("O novo preço do produto com desconto é : " + novop);
		
	}

}