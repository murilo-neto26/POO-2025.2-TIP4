package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			
		   System.out.print("Digite o valor do depósito: ");
	        double dep = sc.nextDouble();

	        System.out.print("Digite a taxa de juros (%): ");
	        double taxa = sc.nextDouble();

	        double rend = dep * taxa / 100;
	        double total = dep + rend;

	        System.out.println("rend: " + rend);
	        System.out.println("Total após rendimento: " + total);
	        
	    }

}
