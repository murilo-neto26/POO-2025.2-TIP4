package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		double salario = sc.nextInt();
		
		System.out.println("Digite o seu aumento: ");
		double percentual = sc.nextInt();
		
		double aumento = percentual * salario/100;
		
		double novosalario = salario + aumento;
		
		System.out.println("O Seu aumento é: R$" + aumento);
		
		System.out.println("O Seu novo salário é: R$" + novosalario);
		


	}

}
