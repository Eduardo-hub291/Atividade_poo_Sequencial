package projetinho;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// Faça um Programa que calcule e mostre a área de um quadrado.
		
		System.out.print("Insira o lado do quadrado: ");
		Scanner en = new Scanner(System.in);
		double num1 = en.nextInt();
		
		
		System.out.println("Área = " + Math.pow(num1, 2));

		en.close();
	}

}
