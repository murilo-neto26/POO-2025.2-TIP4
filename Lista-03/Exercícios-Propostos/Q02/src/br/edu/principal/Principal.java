package br.edu.principal;

import java.util.Scanner;

import br.edu.util.Conversao;

public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Conversao conversor = new Conversao();

	        System.out.print("Digite as horas: ");
	        int horas = scanner.nextInt();

	        System.out.print("Digite os minutos: ");
	        int minutos = scanner.nextInt();

	        System.out.print("Digite os segundos: ");
	        int segundos = scanner.nextInt();

	        int resultado = conversor.converteParaSegundos(horas, minutos, segundos);

	        System.out.println("Horário em segundos: " + resultado);

	    }
	}
}
