package entities;

public class Senha {
	private String categoria, senha;

	public Senha() {

	}

	public Senha(String categoria, String senha) {
		setCategoria(categoria);
		setSenha(senha);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "\n║Categoria: " + categoria + " Senha: " + senha ;
	}

}
