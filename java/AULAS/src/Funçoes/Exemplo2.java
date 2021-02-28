package Funçoes;
import java.util.Scanner;
public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String nome;
		char sexo;
		
		System.out.println("digite seu nome");
		nome = ler.next() .toUpperCase();
		System.out.println("digite o sexo M/F/O");
		sexo = ler.next() .toUpperCase() .charAt(0);
		
		while (sexo != 'M' && sexo != 'F' && sexo != 'O') 
		{
			System.out.println("você digitou errado tente de novo M/F/O");
			sexo = ler .next() .toUpperCase() .charAt(0);
		}
		System.out.println("Fim de programa");

	}

}
