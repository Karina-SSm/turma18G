package LISTA4;
import LISTA4.Cliente;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
		 *  em seguida crie um objeto cliente, 
		 * defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */
		Cliente primeiro = new Cliente ("Milena ", 25);
		System.out.println("Nome "+ primeiro.getNome());
		System.out.println("Codigo "+ primeiro.getCodigo());


	}

}
