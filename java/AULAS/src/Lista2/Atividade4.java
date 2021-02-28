package Lista2;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int valor;
		System.out.println("Digite valor desejado");
		valor = ler.nextInt();
		if (valor %2 == 0) {
		System.out.println ("Essse numero é par, e sua raiz quadrada é:");
		}
		else if(valor %2 == 1) {
			System.out.println("Esse numero é impar");
		}
		
	}   
		 
	}


