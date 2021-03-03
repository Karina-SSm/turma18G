package LISTA4;

public class Contabancaria {
	private String nome;
	private int cpf,senha, numeroConta;
	private double saldo;
	public Contabancaria(String nome, int cpf, int numeroConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
	}
	public Contabancaria(int cpf, int senha, int numeroConta) {
		super();
		this.cpf = cpf;
		this.senha = senha;
		this.numeroConta = numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
	
		return saldo = 5.000;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo ;
	}
	
	

}
