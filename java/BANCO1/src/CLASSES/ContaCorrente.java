package CLASSES;

public class ContaCorrente extends Conta{
	private int contadorTalao;
	
	private void setcontadorTalao () {
	}
	private double talaoCheque;

	public ContaCorrente(int numero, String cpf, double talaoCheque) {
		super(numero, cpf);
		this.talaoCheque = talaoCheque;
	}

	public double getTalaoCheque() {
		return talaoCheque;
	}

	public void setTalaoCheque(double talaoCheque) {
		this.talaoCheque = talaoCheque;
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	//METODO
	public void pedirTalao() {
		if (this.getContadorTalao()<=3) {
			this.setContadorTalao(this.getContadorTalao()+1);
			System.out.println("Talao de cheque solicitado");
		}
		else {
			System.out.println("Limete de talao atingido");
		}
	}
}
