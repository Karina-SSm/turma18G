package LISTA4;
import LISTA4.Aviao;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2) Crie uma classe avi�o e apresente os atributos e m�todos
		 *  referentes esta classe, em seguida
		 *  crie um objeto avi�o, defina as instancias deste objeto e apresente as
		 *   informa��es deste objeto no console.
		 */
		Aviao tam = new Aviao(60," Azul","Antonio"  );
		System.out.println("O Aviao tem " + tam.getQuantidadelugares() + " lugares");
		System.out.println("O passageiro se chama " + tam.getPassageiro());
		System.out.println("O Aviao � de cor  " + tam.getCor());
		

	}

}
