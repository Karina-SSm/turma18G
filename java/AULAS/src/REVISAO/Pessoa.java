package REVISAO;

public class Pessoa {
	//ATRIBUTOS
	private String nome;
	private int dataNascimento;
	private boolean vivo;
	private char genero;
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	//CONETRUTOR / SOBRECARGA
	public Pessoa(String nome, int dataNascimento, char genero) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}
	//METODO
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int idade() {
	return (2021 - dataNascimento);
	}
	public int idade(int anoAtual) {
		return (anoAtual - dataNascimento );
	}

}
