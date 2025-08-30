package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário base: ");
		double sal = sc.nextDouble();
		
		double grat = (sal * 5/100);
		double salario = (sal + grat);
		double imp = (sal * 7/100);
		double receber = (salario - imp);
		
	    System.out.println("O salário a receber é: " + receber);
	    
	}

}
