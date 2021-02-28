package Desafioprogramador;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		System.out.println("Digite numero desejado");
		numero = ler.nextInt();
		
		for (int x = 0; x < numero; x++)
		{
			Traco();
		}
		
		
		
	}
	public static void Traco() {
		
		System.out.print("-");
	}

}
