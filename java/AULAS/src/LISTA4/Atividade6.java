package LISTA4;
import LISTA4.Contabancaria;
public class Atividade6 {

	public static void main(String[] args) {
		/*6) Crie uma classe conta bancaria e apresente os
		 *  atributos e métodos referentes esta classe, em seguida 
		 * crie um objeto conta bancaria, defina as 
		 * instancias deste objeto e apresente as informações deste objeto no console.
		 */
		Contabancaria conta1 = new Contabancaria("Sabrina", 25154754-21,01);
		Contabancaria conta2 = new Contabancaria (25154754-21,363,01);
		System.out.println(" Essa conta pertence á " + conta1.getNome());
		System.out.println("Com o cpf " + conta1.getCpf());
		System.out.println("E numero de conta " + conta1.getNumeroConta() + " tem saldo de "+ conta1.getSaldo());
		System.out.println(" Esse cpf " + conta2.getCpf() + "e senha "+ conta2.getSenha() + " e numero de conta " + conta2.getNumeroConta());
	}
}

