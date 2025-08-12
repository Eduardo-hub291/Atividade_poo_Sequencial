package projetinho;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
		// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		
		System.out.print("Insira o quanto você ganha por hora: ");
		Scanner en = new Scanner(System.in);
		double  money = en.nextInt();
		
		System.out.print("Insira o número de horas trabalhadas por mês: ");
		double  horas= en.nextInt();
		
		
		
		System.out.println("você ganha R$" + money*horas + " por mês");

		en.close();
	}

}
