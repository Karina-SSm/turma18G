package Lista3;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero, contador =0 , soma =0 ;
		double media = 0;
		
		 do  {
			 System.out.println("Digite um numero");
			 numero = ler .nextInt();
			 if (numero %3 == 0 && numero != 0) {
				 soma  = soma + numero;
				 contador++;
				 media = soma /contador;
				 
			 }
		 }
		 while (numero !=0);
			 System.out.printf("A media dos numeros é %f ", media );
		 

	}

}
