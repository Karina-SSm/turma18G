package Lista3;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero, soma = 0;
		do {
			System.out.println("digite um numero");
			numero = ler.nextInt();
			soma = soma + numero;
		}
		while (numero != 0) ;
		System.out.printf("A soma dos numero � %d", soma);
	}

}
