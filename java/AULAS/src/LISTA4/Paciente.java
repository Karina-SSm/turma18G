package LISTA4;

public class Paciente {
	private String nome, doen�a;
	private int numeroSus;
	private char gernero;
	public Paciente(String nome, String doen�a, int numeroSus, char gernero) {
		super();
		this.nome = nome;
		this.doen�a = doen�a;
		this.numeroSus = numeroSus;
		this.gernero = gernero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDoen�a() {
		return doen�a;
	}
	public void setDoen�a(String doen�a) {
		this.doen�a = doen�a;
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
