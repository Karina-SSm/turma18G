package ARRAYS;
import java.util.Random;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Random numero  = new Random();
		int valores [][] = new int [3][3];
		int soma =0, diagonalP=0;
		
		for (int x =0; x<3; x++) {
			for (int y = 0; y<3; y++) {
				
				valores [y] [y]=numero.nextInt(8)+1;
				
				soma = soma + valores[x][y];
				diagonalP = diagonalP + valores[x][y];
				
			}

		}
		System.out.print("A soma é :" + soma);
				
		System.out.print(" A diagonal Principal é" + diagonalP);
	}

}
