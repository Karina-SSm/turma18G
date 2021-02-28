package Lista2;
import java.util.Scanner;
public class Atividadehoje {
	public static void main(String[] args) {
		
	
	Scanner ler = new Scanner (System.in);
   int numero , maiorN = 0;
   do {
	   System.out.println(" digite numero");
	   numero = ler.nextInt();
	   if (numero> maiorN) {
		   maiorN = numero ;
	   }
	   
   }while (numero>=0 );
   System.out.printf("o maior numero é %d", maiorN);
  
	}
	
}
