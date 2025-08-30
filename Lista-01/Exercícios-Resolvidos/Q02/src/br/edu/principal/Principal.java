package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a sua segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite a sua terceira nota: ");
		int nota3 = sc.nextInt();
		
		int soma = nota1 + nota2 + nota3;
        double media = soma/3.0;
		
        System.out.println("O resultado da média é: " + media);

	}

}
