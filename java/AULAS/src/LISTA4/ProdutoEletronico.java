package LISTA4;

public class ProdutoEletronico {
	
	public String usuario;
	public int senha;
	public ProdutoEletronico(String usuario, int senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}
