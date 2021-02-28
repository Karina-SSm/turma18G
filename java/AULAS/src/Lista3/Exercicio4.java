package Lista3;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TOTALPESSOAS = 6; //o valor do enunciado é 150
		int idade, genero, personalidade, calmas = 0, mN = 0, hAg =0, oC =0, 
				nervososM40 = 0 , calmasMenos18 = 0, contador = 1;
		while(contador <= TOTALPESSOAS )
		{
			System.out.print("informe idade ");
			idade = ler.nextInt();
			System.out.print("Informe genero 1- para feminio, 2- para masculino, 3- para outros ");
			genero = ler.nextInt();
			System.out.print("Informe personalidade , 1- calmo, 2- nervoso,3- agressivo ");
			personalidade = ler.nextInt();
			
			if(personalidade == 1)
			{
				calmas = calmas+1;
			}
			if(genero == 1 && personalidade ==2) 
			{
				mN = mN+1;
			}
			if(genero == 2 && personalidade == 3) 
			{
				hAg++;
			}
			if(genero == 3 && personalidade == 1)
			{
				oC++;
				
			}
			if(personalidade == 2 && idade >=40) {
				nervososM40++;
				
			}
			if(personalidade == 1 && idade <18){
				calmasMenos18++;
			
			}
			contador++;
		}
		
			System.out.printf("O nuemro de pessoas calma é %d\n",calmas);
			System.out.printf("O nuemro de  mulheres nervosas  é %d\n",mN);
			System.out.printf("O nuemro de homens agrassivos é %d\n",hAg);
			System.out.printf("O nuemro de outros calmos é %d\n",oC);
			System.out.printf("O nuemro de pessoas nervosas com mais de 40 é %d\n",nervososM40);
			System.out.printf("O nuemro de pessoas calmas com menos de 18 é %d\n",calmasMenos18);
			
			
			
			
	}

}
