package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Escreva a segunda nota: ");
		double nota2 = sc.nextDouble();

		double media = (nota1*2 + nota2*3)/5;
		
		System.out.println("A média ponderada das duas notas é: " + media);
		
	}

}