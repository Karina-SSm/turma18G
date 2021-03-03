package LISTA4;

public class Cliente {
	public String nome;
	public int codigo;
	
	public Cliente(String nome, int codigo) {
		
		this.nome = nome;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	
}



