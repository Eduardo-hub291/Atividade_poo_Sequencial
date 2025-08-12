package projetinho;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		System.out.print("Insira a primeira nota: ");
		Scanner en = new Scanner(System.in);
		double  num1 = en.nextInt();
		
		System.out.print("Insira a segunda nota: ");
		double  num2 = en.nextInt();
		
		System.out.print("Insira a terceira nota: ");
		double  num3 = en.nextInt();
		
		System.out.print("Insira a quarta nota: ");
		double  num4 = en.nextInt();
		
		System.out.println("a média é " + (num1 + num2+num3+num4)/4);

		en.close();
	}

}
