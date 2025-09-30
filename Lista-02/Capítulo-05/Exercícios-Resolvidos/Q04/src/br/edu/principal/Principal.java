package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int maiorAcidentes = -1, menorAcidentes = 999999;
		int codigoMaior = 0, codigoMenor = 0;
		int somaVeiculos = 0;
		int somaAcidenteMenos2000 = 0, contMenor2000 = 0;
		
		for (i = 1; i <= 5; i++) {
			System.out.println("Digite o código da cidade:");
			int cod = sc.nextInt();
			System.out.println("Digite o número de veículos:");
			int veic = sc.nextInt();
			System.out.println("Digite o número de acidentes:");
			int acidente = sc.nextInt();
			
			if (acidente > maiorAcidentes) {
				maiorAcidentes = acidente;
				codigoMaior = cod;		
			}
			if (acidente < menorAcidentes) {
				menorAcidentes = acidente;
				codigoMenor = cod;		
			}
			
			somaVeiculos = somaVeiculos + veic;
			
			if (veic < 2000) {
				somaAcidenteMenos2000 = somaAcidenteMenos2000  + acidente;
				contMenor2000++;
			}
		}
		System.out.printf("Maior índice: %d (cidade %d)\n", maiorAcidentes, codigoMaior);
		System.out.printf("Menor índice: %d (cidade %d)\n", menorAcidentes, codigoMenor);
		System.out.printf("Média de veículos = %.2f\n", somaVeiculos / 5.0);
		
		if (contMenor2000 > 0) {
            System.out.printf("Média de Acidentes (<2000 veículos): %.2f\n",
                    somaAcidenteMenos2000 / (double) contMenor2000);
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }

	}

}