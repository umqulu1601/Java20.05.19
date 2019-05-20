package login

import login.UsuarioBean

class Formularios {
	final UsuarioBean usuarioLogado

	new(UsuarioBean usuario) {
		this.usuarioLogado = usuario
	}

	def void abrirFormCadastro() {
		// cheque o n�vel de acesso, ou se o usu�rio n�o est� logado
		if (usuarioLogado.getUsuario().getNivelDeAcesso() < 2 || usuarioLogado === null) {
			System::out.println("Acesso negado!")
			// ao dar return, o c�digo a seguir n�o ser� executado
			return;
		}
		abrirFormulario()
	}

	def void abrirFormulario() { // l�gica do formul�rio
	}
}
