package EXEMPLOFUNCIONARIO;

public class Funcionario {
	private String nome;
	private int matricula;
	protected int horasTrabalhadas;
   protected double valorHoras;
	public Funcionario(String nome, int matricula, int horasTrabalhadas, double valorHoras) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHoras() {
		return valorHoras;
	}
	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
	public double salario (){
		return (horasTrabalhadas * valorHoras);
	}
	public double salario(double imposto) {
		return (horasTrabalhadas * valorHoras)-(horasTrabalhadas * valorHoras)*imposto;
		
		
	}

}
