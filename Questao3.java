package projetinho;

import java.util.Scanner;

public class Questao3 {

	//Faça um Programa que peça dois números e imprima a soma.
	
	public static void main(String[] args) {
		
		System.out.print("Insira um número: ");
		Scanner en = new Scanner(System.in);
		int num1 = en.nextInt();
		
		System.out.print("Insira outro número: ");
		//Scanner en = new Scanner(System.in);
		int num2 = en.nextInt();
		
		System.out.println("a soma dos números é " + (num1 + num2));

		en.close();

	}

}
