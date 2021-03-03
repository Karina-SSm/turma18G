package LISTA4;

public class Atividade4 {

	public static void main(String[] args) {
		/*4) Crie uma classe funcionário e apresente os atributos e 
		 * métodos referentes esta classe, em seguida crie
		 *  um objeto funcionário, defina as instancias 
		 *  deste objeto e apresente as informações deste objeto no console.
		 */
		Funcionario fun1 = new Funcionario("Arthur", 5579);
		System.out.println("Nome do funcionario é " + fun1.getNome()+ " e seu codigo é " + fun1.getCodigo());
		System.out.println(" O salria do mesmo funcionario é "+ fun1.getSalario());
	}

}
