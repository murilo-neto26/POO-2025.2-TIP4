package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, opcao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o 2º número: ");
		n2 = sc.nextDouble();
		
		System.out.println("Escolha uma opção, 1=Média, 2=Diferença, 3=Produto, 4=Divisão:");
		opcao = sc.nextInt();

		if(opcao == 1) {
			double media = (n1+n2)/2;
			System.out.println("A média é: " + media);
		}
		else if(opcao == 2) {
			double diferenca= n1-n2;
			System.out.println("A diferença é: " + diferenca);
		}
		else if(opcao == 3) {
			double produto = n1*n2;
			System.out.println("O produto é: " + produto);
		}
		else if(opcao == 4) {
			double divisao = n1/n2;
			System.out.println("A divisão é: " + divisao);
		}
		else {
			System.out.println("Erro no programa");
		}
	}
}