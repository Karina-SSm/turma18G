package ARRAYS;
import java.util.Scanner;
public class Tarefa1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valores[]= new int[5];
		int maioP = 0 ;
		
		for (int x = 0; x<5; x++) {
			System.out.println("entre com valor");
			valores [x] = ler .nextInt();
			
			if(maioP<=valores[x]) {
				maioP = valores[x];
			}
		}
		for(int x=0; x<5;x++) {
			System.out.printf("O valor da posição %d é: %d", x+1,  valores[x] );
			System.out.println(" ");
		}
		System.out.printf("A maior pontuação é %d ", maioP);
	
	}

} 
