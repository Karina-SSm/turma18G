package DEUPAU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestesErros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero =0;
	   try {
		
		String nomes []= {"Joao", "Maria","Pedro"};
		System.out.println("Digite o numero da posição do vetor [0-2]");
		numero = ler.nextInt();
		System.out.println("O nome escolhido foi : "+nomes[numero]);
		System.out.println("fim de programa");
       }
		catch (InputMismatchException erro) {
			System.out.println("Você digitou uma letra oa invés de um numero");
		}
	  catch (ArrayIndexOutOfBoundsException erro) {
		  System.out.println("você digitou um numero diferente de 0 - 1 -2 ");
	  }
	
		System.out.println("fim de programa ");
	}

}
