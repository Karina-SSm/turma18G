package lista1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, r, s;
		System.out.println("digite valor de a ");
		a = ler.nextInt();
		System.out.println("digite valor de b");
		b = ler.nextInt();
		System.out.println("digite valor de c");
		c = ler.nextInt();
		/* r = Matematica.potencia((a+b),2)
				 s = Matematica.potencia((b+c),2)
				 d=((r+s)/2)
				 escreva("o valor de d é ",d)*/
		r = (int) Math.pow((a+b),2);
		s = (int) Math.pow((b+c),2);
		d = ((r+s)/2);
		System.out.println("o valor de  D é "+d);
		
				 
		
}

}
