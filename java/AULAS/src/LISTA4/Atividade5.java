package LISTA4;
import LISTA4.Patinete;

public class Atividade5 {

	public static void main(String[] args) {
	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes 
	 * esta classe, em seguida crie 
	 * um objeto patinete, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.
	 */ 
		Patinete brinquedo1 = new Patinete("rosa", 5);
		
		System.out.println(" O  patinete é de cor " + brinquedo1.getCor());
		System.out.println(" È para a idade de  " + brinquedo1.getTamanho() + "anos ");
		
		
		
	}

}
