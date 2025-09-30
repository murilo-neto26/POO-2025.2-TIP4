package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int tr = 0; 
	        int te = 0; 
	        int ta = 0; 
	        double total_classe = 0; 

	        for (int cont = 1; cont <= 6; cont++) {
	            System.out.print("Digite a primeira nota do aluno: ");
	            double n1 = sc.nextDouble();

	            System.out.print("Digite a segunda nota do aluno: ");
	            double n2 = sc.nextDouble();

	            double media = (n1 + n2) / 2;
	            System.out.println("Média do aluno: " + media);

	            if (media <= 3) {
	                tr = tr + 1;
	                System.out.println("Reprovado");
	            } else if (media < 7) { 
	                te = te + 1;
	                System.out.println("Exame");
	            } else { 
	                ta = ta + 1;
	                System.out.println("Aprovado");
	            }

	            total_classe = total_classe + media;
	        }

	        double media_classe = total_classe / 6;

	        System.out.println("Total de reprovados: " + tr);
	        System.out.println("Total de exame: " + te);
	        System.out.println("Total de aprovados: " + ta);
	        System.out.println("Média da classe: " + media_classe);
	    }
	}