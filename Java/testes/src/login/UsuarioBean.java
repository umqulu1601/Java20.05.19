package login;

import login.Usuario;

public class UsuarioBean {
		private Usuario logado;
		public void login(Usuario usuario){
			this.logado = usuario;
		}
		public Usuario getUsuario(){
			return logado;
		}
	}