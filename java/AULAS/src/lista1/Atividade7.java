package lista1;
import java.util.Scanner;


public class Atividade7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a, b, c, d, e, f, x, y;
		System.out.println("entre com valor dea");
		a = ler.nextInt();
		System.out.println("entre com valor de b");
		b = ler.nextInt();
		System.out.println("entre com valor de c");
		c = ler.nextInt();
		System.out.println("wntre com valor de d");
		d = ler.nextInt();
		System.out.println("entre com valor de e");
		e = ler.nextInt();
		System.out.println("entre com valor de f");
		f = ler.nextInt();
		/* x= ((c*et)-(b*f)) / ((a*et)-(b*d))
				 y= ((a*f)-(c*d)) / ((a*et)-(b*d))
				 escreva("valor de x é:",x)
				 escreva("\nvalor de y é:",y)*/
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		System.out.println("o valor de x é "+ x);
		System.out.println("o valoe de y é "+ y);
		
					

	}

}
