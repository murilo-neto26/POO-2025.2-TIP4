package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Digite o raio do círculo: ");
		   double raio = sc.nextDouble();
		   
		   double area = 3.1415 * raio * raio;
		   
		   System.out.println("A área do círculo é: " + area);
		   	    
			}

		}