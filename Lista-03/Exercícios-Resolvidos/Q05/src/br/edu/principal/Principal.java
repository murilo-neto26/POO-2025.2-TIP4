package br.edu.principal;


import java.util.Scanner;
import br.edu.util.CalculoReajuste;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double precoantigo, precoatual, acrescimo;
		
		System.out.println("Digite o preço antigo: ");
		precoantigo = sc.nextDouble();
		
		System.out.println("Digite o preço atual: ");
		precoatual = sc.nextDouble();
		
		acrescimo = CalculoReajuste.calculoReajuste(precoantigo, precoatual);
		
		System.out.printf("O acrescimo é: %.2f%%\n ", acrescimo);
		

	}

}

