package LISTA4;
import LISTA4.ProdutoEletronico;
public class Atividade3 {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletr�nico e apresente os atributos e 
		 * m�todos referentes esta classe, em seguida crie um objeto
		 *  produto eletr�nico, defina as instancias deste objeto e
		 *   apresente as informa��es deste objeto no console.
		 */
		ProdutoEletronico appCompras = new ProdutoEletronico("karina " , 5867);
		System.out.println("Bem vinda " + appCompras.getUsuario() + " vamos fazer compras??");
		System.out.println("sua senha � " + appCompras.getSenha());
		
	}

}
