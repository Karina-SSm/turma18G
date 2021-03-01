package ARRAYS;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String agenda [][] = new String [24][31];
		int dia , hora , atividade =0;
		char opcao ;
		do {
			System.out.println("minha agenda");
			System.out.println("Digite dia [1 a 31]");
			dia = ler.nextInt();
			dia = dia -1;
			System.out.println("Digite a hora [0 a 24]");
			hora = ler.nextInt();
			System.out.println(" Digite tarefa");
			agenda[hora][dia] = ler.next();
			System.out.println(" Continua? 1-Sim ou 2-Nao");
			opcao = ler.next().charAt(0);
			
		}
		while (opcao != '2');
			for (int x = 0; x<agenda.length; x++ ) {
				for (int y =0; y<agenda[x].length; y++) {
					if (agenda[x][y] != null) {
						System.out.println(" Minhas tarefas: dia " + (y+1)+ " as " +x + "h: "  + agenda[x][y]);
						atividade++;
					}
				} 
				
			}
			System.out.println(" Voce tem " + atividade+ " nesse mes ");
			
		
	}

}
