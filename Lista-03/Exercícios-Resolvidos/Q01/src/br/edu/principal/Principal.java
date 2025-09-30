package br.edu.principal;

import java.util.Scanner;
import br.edu.util.Verifica;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		int x;
		
	    System.out.println("Digite um número: ");
		num = sc.nextDouble();
		
		x = Verifica.verifica(num);
		
		if (x==1) {
			System.out.println("Este número é Positivo!");
		}
		else {
			System.out.println("Este número é Negativo!");
		}

	}

}

