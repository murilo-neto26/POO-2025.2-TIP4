package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Escreva o segundo número: ");
		double num2 = sc.nextDouble();

		double divisao = (num1 / num2);

		System.out.println("A divisão do primeiro número pelo segundo é : " + divisao);
		
	}

}