package br.ucsal;

import java.util.Scanner;

public class Treinamento0004 {

	public static void main(String[] args) {
		String reverse, string = "";
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Digite a palavra que voc� pretende inverter:");
		string = userInput.next();
		System.out.println(new StringBuilder(string).reverse().toString());
		
	}

}
