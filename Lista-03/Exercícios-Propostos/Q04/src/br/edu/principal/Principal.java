package br.edu.principal;

import java.util.Scanner;
import br.edu.calcular.Calcular_volume;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Calcular_volume utils = new Calcular_volume();

	    System.out.print("Digite o raio da esfera: ");
	    double raio = sc.nextDouble();

	    double volume = utils.calcularVolumeEsfera(raio);

	    System.out.printf("O volume da esfera é: %.2f\n", volume);
	    }
	}