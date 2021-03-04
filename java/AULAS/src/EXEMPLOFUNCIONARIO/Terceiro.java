package EXEMPLOFUNCIONARIO;

public class Terceiro extends Funcionario {
	private double adicional;

	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorHoras, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorHoras);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double salario() {
		
		return (horasTrabalhadas * valorHoras) + adicional;
		
		
	}

}
