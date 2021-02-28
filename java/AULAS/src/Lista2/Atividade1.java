package Lista2;
import java.util.Scanner;


public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numeros []  = new int [3];
		int maiorN =0;
		for (int x =0; x<3; x++) { 
			System.out.println("ente com numero ");
			numeros[x] = ler.nextInt();
			if (numeros[x] > maiorN ) {
				maiorN = numeros[x];
				
			}
			
		}
		System.out.println("o maior numero é " +maiorN);
		
			 

	}

}
