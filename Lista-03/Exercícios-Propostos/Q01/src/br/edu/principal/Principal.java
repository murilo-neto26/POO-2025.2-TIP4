package br.edu.principal;

import java.util.Scanner;
import br.edu.soma.Soma_dos_números;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	    System.out.print("Digite um número inteiro e positivo: ");
	        
	    if (sc.hasNextInt()) {
	    int num = sc.nextInt();
	            
	    long resultado = Soma_dos_números.somar(num);
	            
	    if (resultado > 0) {
	    	System.out.println("\nResultado:");
	        System.out.println("A soma de 1 até " + num + " é: " + resultado);
	            }
	    }
	    else {
	        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
	        }
	        
	    }
	}