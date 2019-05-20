package login

class Usuario {
	String login
	String senha
	Integer nivelDeAcesso

	def void setLogin(String login) {
		this.login = login
	}

	def String getLogin() {
		return login
	}

	def void setSenha(String senha) {
		this.senha = senha
	}

	def String getSenha() {
		return senha
	}

	def void setNivelDeAcesso(Integer nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso
	}

	def Integer getIntegerNivelDeAcesso() {
		return nivelDeAcesso
	}

	def int getNivelDeAcesso() {
		// TODO Auto-generated method stub
		return 0
	}
}
