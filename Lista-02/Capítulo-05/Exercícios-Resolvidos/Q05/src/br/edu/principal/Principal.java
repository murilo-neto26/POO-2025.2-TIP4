package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i, j, num_termos, fim, denominador, den, expoente;
		long fat;
		double x, s, termo;
		
		System.out.println("Digite o número de termos: ");
		num_termos = sc.nextInt();
		System.out.println("Digite um valor positivo para X: ");
		x = sc.nextDouble();
		
		s = 0.0;
		denominador = 1;
		den = 1;
		
		for (i = 1; i <= num_termos; i++) {
            expoente = i + 1;
            
            fim = denominador;
            fat = 1;
            
            for (j = 1; j <= fim; j++) {
            	fat = fat * j;
            }
        expoente = i + 1;
        
        termo = Math.pow(x, expoente) / fat;
        
        if (i % 2 == 1) {
            s -= termo;
        } else {
            s += termo;
        }
       
        if (denominador == 4) {
        	den = -1;
        }
        
        if (denominador == 1) {
        	den = 1;
        }
        
        if (den == 1) {
        	denominador = denominador + 1;
        }
        else {
        	denominador = denominador - 1;
        }
        
	  }
		
		System.out.println("O Valor da série é: " + s);
	}
}