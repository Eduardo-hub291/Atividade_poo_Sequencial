package projetinho;

import java.util.Scanner;

public class Questaoa10 {

	public static void main(String[] args) {
		// 10.Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//		a. o produto do dobro do primeiro com metade do segundo .
//		b. a soma do triplo do primeiro com o terceiro.
//		c. o terceiro elevado ao cubo.
		
		System.out.print("Insira um número inteiro: ");
		Scanner en = new Scanner(System.in);
		int  int1 = en.nextInt();
		
		System.out.print("Insira outro número inteiro: ");
		int  int2= en.nextInt();
		
		System.out.print("Insira um número real: ");
		double  real= en.nextDouble();
		
		
		
		System.out.println("a) " + int1*int2);
		System.out.println("b) " + ((int1*3) + real));
		System.out.println("c) " + Math.pow(real, 3));



		en.close();

	}

}
