package Lista3;
import java.util.Scanner; 

public class Exercico3 {

	public static void main(String[] args) {
		Scanner ler = new  Scanner (System.in);
		
		int idade , menorIdd =0, maiorIdd =0;
		System.out.println("Qual é a sua idade");
		idade = ler.nextInt();	
		
		while (idade!= -99)
		{
			System.out.println("Qual é a sua idade");
			idade = ler.nextInt();	
			if(idade<21) {
				menorIdd = menorIdd + 1;
			}else if (idade>50) {
				maiorIdd = maiorIdd + 1;
			}
			
		}
		System.out.printf("A quantidade de pessoa menores de 21 é %d\n", menorIdd);
		System.out.printf("A quantidade de pessoa maiores de 50 é %d\n", maiorIdd );
		

	}

}
