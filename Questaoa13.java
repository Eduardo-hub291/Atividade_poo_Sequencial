package projetinho;

import java.util.Scanner;

public class Questaoa13 {

	public static void main(String[] args) {
		
		
		System.out.print("peso: ");
		
		Scanner en = new Scanner(System.in);
		double peso = en.nextDouble();
		double exc = (peso - 50);
		double multa = (exc*4);
		
		
		if (peso<=50) { 
			exc = (0);
			multa = (0);
			System.out.println("excesso: Zero ou Negativo");
			System.out.println("multa: Zero ou Negativo");
			
		} else {
			
			System.out.println("excesso: " + exc);
			System.out.println(" multa: " + multa);


		}




	
		en.close();

		
	}

}
