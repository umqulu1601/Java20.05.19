package login

import login.UsuarioBean

class Formularios {
	final UsuarioBean usuarioLogado

	new(UsuarioBean usuario) {
		this.usuarioLogado = usuario
	}

	def void abrirFormCadastro() {
		// cheque o nível de acesso, ou se o usuário não está logado
		if (usuarioLogado.getUsuario().getNivelDeAcesso() < 2 || usuarioLogado === null) {
			System::out.println("Acesso negado!")
			// ao dar return, o código a seguir não será executado
			return;
		}
		abrirFormulario()
	}

	def void abrirFormulario() { // lógica do formulário
	}
}
