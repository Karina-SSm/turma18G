package Lista2;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int Idade;
		System.out.println("entre com sua idade");
		Idade = ler.nextInt();
		if (Idade>= 10 && Idade<=14) {
			System.out.println("Olá você esta classificado(a) como infantil");
		}
		else if(Idade>=15 && Idade<=17) {
			System.out.println("Olá vc esta classificado(a) como juvenil");
		}
		else if (Idade>=18 && Idade<=25) {
			System.out.println("Olá vc esta classificado(a) como adulto");
		}

	}

}
