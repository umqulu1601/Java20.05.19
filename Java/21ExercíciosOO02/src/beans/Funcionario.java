package beans;

public class Funcionario {
	
	private String nome, usuario, tipodeusuario, email;
	private int senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTipodeusuario() {
		return tipodeusuario;
	}
	public void setTipodeusuario(String tipodeusuario) {
		this.tipodeusuario = tipodeusuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}