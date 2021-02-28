package Lista3;
import java.util.Scanner;
public class Exercico2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero, par = 0 , impar = 0;
		for(int x= 0; x<=9; x++) {
			System.out.println("Digite um numero");
			numero = ler .nextInt();
			if (numero %2==0) {
				par = par +1;
			}
			else {
				impar = impar +1;
			}
			
		}
		System.out.printf("A quantidade de numero par é %d\n", par);
		System.out.printf("A quantidade de numero impar é %d\n", impar);

	}

}
