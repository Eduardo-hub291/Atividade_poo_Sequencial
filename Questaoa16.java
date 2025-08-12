package projetinho;

import java.util.Scanner;

public class Questaoa16 {

	public static void main(String[] args) {
	/* 16.Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
	metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
	para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
	R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
	o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
	preços em 2 situações:
	o comprar apenas latas de 18 litros;
	o comprar apenas galões de 3,6 litros; */

		System.out.print("Área: ");
		Scanner en = new Scanner(System.in);
		double area = en.nextInt();
		double litros = (area/6);
		double latas = (int) Math.ceil(litros/18);	
		double galoes = (int) Math.ceil(litros/3.6);		

		
		System.out.println("serão necessárias "+ latas+ " latas ao custo de R$"+ latas*80 );
		System.out.println("ou "+ galoes+ " galões ao custo de R$"+ galoes*25 );


		en.close();
		
	}

}
