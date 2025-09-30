package br.edu.principal;

import java.util.Scanner;
import br.edu.util.Transformacao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int segundos;
		
		System.out.println("Digite os segundos: ");
		segundos = sc.nextInt();
		
		Transformacao.transforma(segundos);

	}

}

