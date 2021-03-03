package LISTA4;
import LISTA4.ProdutoEletronico;
public class Atividade3 {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletrônico e apresente os atributos e 
		 * métodos referentes esta classe, em seguida crie um objeto
		 *  produto eletrônico, defina as instancias deste objeto e
		 *   apresente as informações deste objeto no console.
		 */
		ProdutoEletronico appCompras = new ProdutoEletronico("karina " , 5867);
		System.out.println("Bem vinda " + appCompras.getUsuario() + " vamos fazer compras??");
		System.out.println("sua senha é " + appCompras.getSenha());
		
	}

}
