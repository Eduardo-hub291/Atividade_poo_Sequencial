package projetinho;

import java.util.Scanner;

public class Questaoa14 {

	public static void main(String[] args) {
		/* 14.Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
		que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
		sindicato, faça um programa que nos dê:
		a. salário bruto.
		b. quanto pagou ao INSS.
		c. quanto pagou ao sindicato.
		d. o salário líquido.
		e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
		f. + Salário Bruto : R$
		g. - IR (11%) : R$
		h. - INSS (8%) : R$
		i. - Sindicato ( 5%) : R$
		j. = Salário Liquido : R$
		Obs.: Salário Bruto - Descontos = Salário Líquido. */
		
		
		System.out.print("Quanto você ganha por hora: ");
		Scanner en = new Scanner(System.in);
		double porhora = en.nextDouble();
		System.out.print("Quantas horas você trabalha por mês: ");
		int mes = en.nextInt();
		
		double bruto = (porhora*mes);
		
		System.out.println("a. Salário Bruto = R$" + bruto);
		System.out.println("b. Quanto pagou ao INSS = R$" + bruto*0.08);
		System.out.println("c. Quanto pagou ao sindicato = R$" + bruto*0.05);
		System.out.println("c. O salário líquido = R$" + (bruto - bruto*0.24));

		en.close();
	}

}
