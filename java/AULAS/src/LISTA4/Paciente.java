package LISTA4;

public class Paciente {
	private String nome, doença;
	private int numeroSus;
	private char gernero;
	public Paciente(String nome, String doença, int numeroSus, char gernero) {
		super();
		this.nome = nome;
		this.doença = doença;
		this.numeroSus = numeroSus;
		this.gernero = gernero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDoença() {
		return doença;
	}
	public void setDoença(String doença) {
		this.doença = doença;
	}
	public int getNumeroSus() {
		return numeroSus;
	}
	public void setNumeroSus(int numeroSus) {
		this.numeroSus = numeroSus;
	}
	public char getGernero() {
		return gernero;
	}
	public void setGernero(char gernero) {
		this.gernero = gernero;
	}
	
	

}
