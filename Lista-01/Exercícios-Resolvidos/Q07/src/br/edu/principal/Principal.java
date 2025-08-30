package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário base: ");
		double sal = sc.nextDouble();
		
		double grat = (sal + 50.0);
		double imp = (sal * 10/100);
		double receber = (grat - imp);
		
	    System.out.println("O salário a receber é: " + receber);
	    
   }

}
