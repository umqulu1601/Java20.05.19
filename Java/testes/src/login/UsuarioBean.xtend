package login

import login.Usuario

class UsuarioBean {
	Usuario logado

	def void login(Usuario usuario) {
		this.logado = usuario
	}

	def Usuario getUsuario() {
		return logado
	}
}
