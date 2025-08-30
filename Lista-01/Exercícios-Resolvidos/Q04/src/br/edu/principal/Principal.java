package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		int salario = sc.nextInt();
		
		double aumento = salario + salario * 25/100;
		
		System.out.println("O Seu novo salário, com aumento é: " + aumento);

	}

}
