package ATIVIDADES;

public class Animal {
	private String nome;
	private int idade ;
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void emitirSom () {
		this.emitirSom();
		System.out.println("Esse é o som que eu faço ");
	}
	public void correr () {
		this.correr();
		System.out.println(" estou correndo ");
	}

}
