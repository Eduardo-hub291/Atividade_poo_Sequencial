package projetinho;

import java.util.Scanner;

public class Questaoa12 {

	public static void main(String[] args) {
		// 12.Tendo como dado de entrada a altura, construa um algoritmo que calcule seu peso ideal,
		// utilizando as seguintes fórmulas:
		
		//Para homens: (72.7*h) - 58
		//	Para mulheres: (62.1*h) - 44.7 (h = altura)
		
		System.out.print("Insira a altura: ");
		Scanner en = new Scanner(System.in);
		double  num1 = en.nextDouble();
	
		System.out.println("o peso ideal para homens: " + ((num1*72.7) - 58) + "Kg");
		System.out.println("o peso ideal para mulheres: " + ((num1*62.1) - 44.7) + "Kg");


		en.close();
	}

}
