package projetinho;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		// 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a
		//temperatura em graus Celsius.    C = (5 * (F-32) / 9) / C = (F – 32) / 1,8
		
		System.out.print("Farenheit: ");
		Scanner en = new Scanner(System.in);
		double F = en.nextInt();
		
		
		System.out.println("Graus Celsius: " + 5* (F-32)/9);
		
		en.close();
	}

}
