package ARRAYS;
import java.util.Random;
import java.util.Scanner;
public class Tarefa2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int lancamentos []= new int [10];
		double mediaAri = 0.0;
		int maioP = 0, contadorMP = 0; 
				double somaV =0;
		Random dado = new Random ();//chamar criar 
		
		for(int x = 0; x<lancamentos.length; x++) {
		
			//System.out.printf("Digite o %d resultado do lancamento:", x+1);
			//lancamentos[x]= ler .nextInt();
			//lancamentos[x]= (int)(Math.random()*6)+1;//interface
			lancamentos [x]= dado.nextInt(6)+1;
		}
	
		
		for (int x = 0; x<lancamentos.length;x++) {
			System.out.printf("o valor do lancamentos %d e %d \n" ,x+1, lancamentos[x] );
			somaV = somaV + lancamentos[x];
			if(lancamentos[x]>= maioP) {
				if(lancamentos [x] > maioP) {
					contadorMP = 0;
				}
				maioP = lancamentos[x];
				contadorMP ++;
				
		}
		mediaAri = somaV / (double)lancamentos.length;
		System.out.printf("Total dos lancamentos digitados: %.0f\n",somaV);
		System.out.printf("A media é: %.2f \n ", mediaAri);
		System.out.printf("O maior valor é %d \n ", maioP);
		System.out.printf("O maior valor é : %d vezes", contadorMP);
		
		
		
		

	}

	

	}
	
	}
