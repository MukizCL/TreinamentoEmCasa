package br.ucsal;

import java.util.Scanner;

public class Treinamento0001 {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int v1, v2, a, b, c;
		System.out.println("Digite o primeiro n�mero:");
		v1 = ent.nextInt();
		System.out.println("Digite o segundo n�mero:");
		v2 = ent.nextInt();
		
		if (v1 >= 0 && v2 >= 0) {
			a = v1;
			b = v2;
			c = a + b;
			System.out.println("O resultado �: " + c);
					
		} else {
			System.out.println("Problema ao informar valores.");
		}
	}

}
