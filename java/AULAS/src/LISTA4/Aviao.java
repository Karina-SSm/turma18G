package LISTA4;

public class Aviao {
	public int quantidadelugares;
	public String cor;
	public String passageiro;
	public Aviao(int quantidadelugares, String cor, String passageiro) {
		super();
		this.quantidadelugares = quantidadelugares;
		this.cor = cor;
		this.passageiro = passageiro;
	}
	public int getQuantidadelugares() {
		return quantidadelugares;
	}
	public void setQuantidadelugares(int quantidadelugares) {
		this.quantidadelugares = quantidadelugares;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}
	
	
	

}
