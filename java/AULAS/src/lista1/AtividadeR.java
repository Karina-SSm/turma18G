package lista1;

import java.util.Scanner;



public class AtividadeR {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		java.util.Scanner ler = new Scanner (System.in);
		
		int Idade;
		
		System.out.println("Digite sua idade");
		Idade = ler.nextInt();
		
				
			if (Idade>=5 && Idade<=7){
				System.out.println("Você esta categoria infantil 1");
			}
			else if (Idade >= 8 && Idade<=11) {
				System.out.println("Você esta categoria infantil 2");
			}
			else if(Idade>=12 && Idade<=13) {
		System.out.println("Você esta na categoria juvenil 1");

	}
			else if(Idade>=14 && Idade<=17) {
				System.out.println("você esta na categoria juvenil 2");
			}
			else if (Idade>=18) {
				System.out.println("Infelismente não temo categoria disponivel para  você");
				
			}

}
	}
