package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3, media, notaExame;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a sua segunda nota: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite a sua terceira nota: ");
		n3 = sc.nextDouble();
		
		media = (n1 + n2 + n3)/3;
		
		System.out.println("A sua média final é: " + media);
		
		if (media >= 0 & media < 3) {
			System.out.println("Reprovado!");
		}
		else if (media >= 3 & media < 7) {
			System.out.println("Exame!");
			notaExame = 12 - media;
			System.out.println("Você deve tirar: " + notaExame + " para ser Aprovado!");
			
		}
		if (media >= 7 & media<= 10){
			System.out.println("Aprovado!");
		}
		

	}

}