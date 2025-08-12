package projetinho;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		//Faça um Programa que converta metros para centímetros.
		
		System.out.print("Insira uma medida em metros: ");
		Scanner en = new Scanner(System.in);
		int num1 = en.nextInt();
		
		
		System.out.println(num1+" em centímetros é " + num1*100);

		en.close();
	}

}
