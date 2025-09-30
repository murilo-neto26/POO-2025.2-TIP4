package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double ano_atual, salario, sal_novo, percentual;
		
		salario = 1000;
		percentual = 1.5/100;
		ano_atual = 2025;
		
		sal_novo = salario + (percentual * salario);
		for(int i = 2007; i < 2026; i++ ) {
			System.out.printf("Ano: %d - Aumento de %.6f%n -" + "Salario: R$ %.2f%n", i, percentual, sal_novo);
			
			percentual *= 2;
			System.out.printf("Novo Percentual: %.6f%n", percentual);
			sal_novo = sal_novo + (sal_novo * percentual);
			System.out.printf("Salario Novo: %.2f%n", sal_novo);
			
		}
		
	}

}