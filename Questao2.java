package projetinho;

import java.util.Scanner; 

public class Questao2 {

	public static void main(String[] args) {

		//Faça um Programa que peça um número e então mostre a mensagem "O número informado foi [número]".
		
		System.out.print("Insira um número: ");
		
		Scanner en = new Scanner(System.in);
		int numI = en.nextInt();
		
		System.out.println("O número informado foi " + numI);

		en.close();

		// comentário teste de nova brench
		
	}

}
