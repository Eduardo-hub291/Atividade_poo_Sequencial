package projetinho;

import java.util.Scanner;

public class Questaoa11 {

	public static void main(String[] args) {
		// 11.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
		// calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
		
		System.out.print("Insira a altura: ");
		Scanner en = new Scanner(System.in);
		double  num1 = en.nextDouble();
	
		System.out.println();
		System.out.println("o peso ideal é " + ((num1*72.7) - 58) + "Kg");

		en.close();

	}

}
