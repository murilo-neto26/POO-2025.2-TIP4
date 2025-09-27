package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1º nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a 2º nota: ");
		n2 = sc.nextDouble();
		media = (n1+n2)/2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		}
		
		else if(media >= 3 & media < 7) {
			System.out.println("Exame");		
		}

		else {
			System.out.println("Reprovado");
		}
	}
}