package LISTA4;

public class Atividade4 {

	public static void main(String[] args) {
		/*4) Crie uma classe funcion�rio e apresente os atributos e 
		 * m�todos referentes esta classe, em seguida crie
		 *  um objeto funcion�rio, defina as instancias 
		 *  deste objeto e apresente as informa��es deste objeto no console.
		 */
		Funcionario fun1 = new Funcionario("Arthur", 5579);
		System.out.println("Nome do funcionario � " + fun1.getNome()+ " e seu codigo � " + fun1.getCodigo());
		System.out.println(" O salria do mesmo funcionario � "+ fun1.getSalario());
	}

}
