package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double trab_lab, av_sem, exam_final, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do TRABALHO DE LAB: ");
		trab_lab = sc.nextDouble();
		
		System.out.println("Digite a nota do AVALIAÇÃO SEMESTRAL: ");
		av_sem = sc.nextDouble();
		
		System.out.println("Digite a nota do EXAME FINAL: ");
		exam_final = sc.nextDouble();
		
		media = (trab_lab*2 + av_sem*3 + exam_final*5)/10;
		
        System.out.println("A SUA MÉDIA FINAL É: " + media);
		
		if (media >= 8) {
			System.out.println("Conceito A");
		}
		else if (media < 8 & media >= 7) {
			System.out.println("Conceito B");
		}
		else if (media < 7 & media >= 6) {
			System.out.println("Conceito C");
		}
		else if (media < 6 & media >= 5) {
			System.out.println("Conceito D");
		}
		else if (media < 5 & media >= 3) {
			System.out.println("Conceito E");
		}
		else {
			System.out.println("Conceito F");
		}


	}

}