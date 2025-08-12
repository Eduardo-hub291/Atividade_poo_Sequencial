package projetinho;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		System.out.print("Insira o raio do círculo: ");
		Scanner en = new Scanner(System.in);
		double num1 = en.nextInt();
		
		
		System.out.println("Área = " + num1 * num1 *Math.PI);

		en.close();
	}

}
