package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite o peso da nota1: ");
		int peso1 = sc.nextInt();
		
		System.out.println("Digite a sua segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite o peso da nota2: ");
		int peso2 = sc.nextInt();

		System.out.println("Digite a sua terceira nota: ");
		int nota3 = sc.nextInt();
		
		System.out.println("Digite o peso da nota3: ");
		int peso3 = sc.nextInt();

		double media = (nota1*peso1+nota2*peso2+nota3*peso3) / peso1+peso2+peso3;
		
		System.out.println("O resultado da média ponderada é: " + media);

		
	}

}
